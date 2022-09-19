package com.FuelManagement.AllocationService.AllocationEntiry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    private Integer orderID;
    private Integer allocationAmount;
    private String status;

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public Integer getAllocationAmount() {
        return allocationAmount;
    }

    public void setAllocationAmount(Integer allocationAmount) {
        this.allocationAmount = allocationAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
