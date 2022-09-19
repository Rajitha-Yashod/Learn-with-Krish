package com.FuelManagement.ScheduleService.ScheduleEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Index;
import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AllocationChecker {
    private Long id;
    private Integer orderId;
    private Integer allocationAmount;
    private String status;
    private Boolean isStockAvailable;
    private ArrayList<Integer> createAt;
}
