package com.FuelManagement.OrderService.Service;

import com.FuelManagement.OrderService.OrderEntiry.Order;
import com.FuelManagement.OrderService.OrderRepositoy.OrderRepository;
import com.FuelManagement.OrderService.Request.OrderRequest;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class OrderService {
    @Autowired
    private final OrderRepository orderRepository;
    KafkaTemplate<String, Order> kafkaTemplate;

    public void placeOrder(OrderRequest orderRequest){
        Order order=Order.builder()
                .status("createdOrder")
                .createAt(LocalDateTime.now())
                .allocationAmount(orderRequest.allocationAmount())
                .build();

        Message<Order> message= MessageBuilder.withPayload(order)
                .setHeader(kafkaHeaderds.TOPIC,"mainTopic")
                .build();
        orderRepository.save(order);
        kafkaTemplate.send(message);
    }
}
