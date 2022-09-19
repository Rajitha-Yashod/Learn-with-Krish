package com.FuelManagement.ScheduleService.Service;

import com.FuelManagement.ScheduleService.Repository.ScheduleRepository;
import com.FuelManagement.ScheduleService.ScheduleEntity.AllocationChecker;
import com.FuelManagement.ScheduleService.ScheduleEntity.Schedule;
import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;
    KafkaTemplate<String, Schedule> kafkaTemplate;

    @KafkaListener(topics = "secondTopic", groupId = "groupId")
    public void scheduleOrder(String data){

        Gson g = new Gson();
        AllocationChecker allocationChecker = g.fromJson(data,AllocationChecker.class);

        List<Integer> date = allocationChecker.getCreateAt();
        LocalDateTime createdAt =LocalDateTime.of(date.get(0),date.get(1),date.get(2), date.get(3),date.get(4),date.get(5),date.get(6));
        System.out.println(createdAt);

        Schedule schedule = Schedule.builder()
                .orderId(allocationChecker.getOrderId())
                .allocationAmount(allocationChecker.getAllocationAmount())
                .status("Order Scheduled")
                .createdAt(createdAt)
                .scheduleTime(LocalDateTime.now().plusDays(5))
                .build();
        scheduleRepository.save(schedule);

        Message<Schedule> message = MessageBuilder.withPayload(schedule)
                .setHeader(KafkaHeaders.TOPIC,"thirdTopic")
                .build();
        kafkaTemplate.send(message);
    }
}
