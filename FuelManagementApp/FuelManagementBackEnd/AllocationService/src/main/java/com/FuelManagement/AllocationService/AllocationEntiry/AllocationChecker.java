package com.FuelManagement.AllocationService.AllocationEntiry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AllocationChecker {

    @Id
    @SequenceGenerator(
            name="allocationIdSequence",
            sequenceName = "allocationIdSequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "allocationIdSequence"
    )

    private Long id;
    private Integer orderId;
    private Integer allocationAmount;
    private String status;
    private Boolean isStockAvailable;
    private LocalDateTime createdTime;
}
