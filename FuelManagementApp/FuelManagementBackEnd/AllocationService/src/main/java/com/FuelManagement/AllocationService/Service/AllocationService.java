package com.FuelManagement.AllocationService.Service;

import com.FuelManagement.AllocationService.AllocationEntiry.AllocationChecker;
import com.FuelManagement.AllocationService.AllocationEntiry.Order;
import com.FuelManagement.AllocationService.AllocationEntiry.Stock;
import com.FuelManagement.AllocationService.Repository.AllocationCheckerRepository;
import com.FuelManagement.AllocationService.Repository.StockRepository;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class AllocationService {
    private final AllocationCheckerRepository allocationCheckerRepository;
    private final StockRepository stockRepository;

    static DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
    KafkaTemplate<String, AllocationChecker> kafkaTemplate;

    @KafkaListener(topics = "mainTopic", groupId = "groupID")
    public void listenerForOrder(String data) {
        Integer alreadyAllocatedStock;
        Integer availableStock;
        Integer allocationStock;


        Gson gson = new Gson();
        Order order = gson.fromJson(data, Order.class);
        List<Stock> stockList = stockRepository.findByIdDESC();
        Stock stock = stockList.get(0);

        alreadyAllocatedStock = stock.getAllocatedAmount();
        availableStock = stock.getAvailableStock();
        allocationStock = order.getAllocationAmount();
        Boolean checkStock = checkStock(availableStock, allocationStock, alreadyAllocatedStock);

        log.info("Listener Received json object:{}", order);
        AllocationChecker allocationChecker = AllocationChecker.builder()
                .orderId(order.getOrderID())
                .allocationAmount(order.getAllocationAmount())
                .status(checkStock(checkStock))
                .createdAt(LocalDateTime.now())
                .isStrockAvailable(checkStock)
                .build();
        allocationCheckerRepository.save(allocationChecker);
        Message<AllocationChecker> message = MessageBuilder.withPayload(allocationChecker)
                .setHeader(KafkaHandlers.TOPIC, "secondTopic")
                .build();
        kafkaTemplate.send(message);
    }

    public void stockUpdate(UpdateStock updateStock) {
        List<Stock> stockList = stockRepository.findByIdDESC();

        if (stockList.isEmpty() == true) {
            Stock stock = Stock.builder()
                    .allocatedAmount(updateStock.allocatedAmount())
                    .availableStock(updateStock.availableStock())
                    .build();
            stockRepository.save(stock);
        } else {
            Stock stock = stockList.get(0);
            Integer alreadyAllocatedStock = stock.getAllocatedAmount();
            Integer availableStock = stock.getAvailableStock();
            Integer TotalStock = availableStock + updateStock.availableStock();

            Stock stock1 = Stock.builder()
                    .allocatedAmount(TotalStock)
                    .availableStock(TotalStock)
                    .build();
            stockRepository.save(stock1);
        }


    }


    public Boolean checkStock(Integer availableStock, Integer allocationStock, Integer alreadyAllocatedStock) {
        if (availableStock >= allocationStock) {
            Integer balanceStock = allocationStock - allocationStock;
            Integer TotalAllocation = alreadyAllocatedStock + allocationStock;
            Stock stock = Stock.builder()
                    .allocatedAmount(TotalAllocation)
                    .availableStock(balanceStock)
                    .build();

            stockRepository.save(stock);
            return true;
        }else
            return false;
    }

   public String checkStatus(Boolean checkStock){
        if(checkStock==true){
            return "Order Allocated";
        }else {
            return "Out Of Stocks";
        }
   }
}
