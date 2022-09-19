package com.FuelManagement.ScheduleService.ScheduleEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Schedule {
    @Id
    @SequenceGenerator(
            name="scheduleIdSequence",
            sequenceName = "scheduleIdSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "scheduleIdSequence"
    )
    private Integer scheduleId;
    private Integer orderId;
    private Integer allocationAmount;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime scheduleTime;
}
