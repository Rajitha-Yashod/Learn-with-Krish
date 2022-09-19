package com.FuelManagement.DispatchService.DispatchService;

import com.FuelManagement.DispatchService.DispatchEntity.Dispatch;
import com.FuelManagement.DispatchService.DispatchEntity.Schedule;
import com.FuelManagement.DispatchService.DispatchRepository.DispatchRepository;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class DispatchService {
    private final DispatchRepository dispatchRepository;

    public void dispatchOrder(String data){
        Gson gson =new Gson();
        Schedule scheduleOrder= gson.fromJson(data,Schedule.class);

        List<Integer> scheduleDate = scheduleOrder.getScheduleTime();
        LocalDateTime scheduledTime=LocalDateTime.of(scheduleDate.get(0),scheduleDate.get(1),
                scheduleDate.get(2),scheduleDate.get(3),scheduleDate.get(4),scheduleDate.get(5),
                scheduleDate.get(6));
        log.info("Set time: {}",scheduledTime);
        Boolean isDispatched= isDispatched(scheduledTime);

        Dispatch dispatch=Dispatch.builder()
                .orderId(scheduleOrder.getOrderId())
                .allocAmount(scheduleOrder.getAllocAmount())
                .createdAt(LocalDateTime.now())
                .dispatchAt(scheduledTime)
                .status(checkStatus(isDispatched))
                .build();
        dispatchRepository.save(dispatch);

    }

    private Boolean isDispatched(LocalDateTime scheduledTime) {
        if(LocalDateTime.now()==scheduledTime){
            return true;
        }else {
            return false;
        }
    }

    public String checkStatus(Boolean isDispatched){
        if(isDispatched==true){
            return "Order Dispatched";
        }else {
            return "Order Not Dispatched";
        }
    }

}
