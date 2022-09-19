package com.FuelManagement.DispatchService.DispatchEntity;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
@Builder
public class Schedule {
    @Id
    private Integer scheduleId;
    private Integer orderId;
    private Integer allocationAmount;
    private String status;
    private ArrayList<Integer> createdAt;
    private ArrayList<Integer>  scheduleTime;

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getAllocAmount() {
        return allocationAmount;
    }

    public void setAllocAmount(Integer allocAmount) {
        this.allocationAmount = allocAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Integer> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ArrayList<Integer> createdAt) {
        this.createdAt = createdAt;
    }

    public ArrayList<Integer> getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(ArrayList<Integer> scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Schedule() {
    }

    public Schedule(Integer scheduleId, Integer orderId, Integer allocAmount, String status, ArrayList<Integer> createdAt, ArrayList<Integer> scheduleTime) {
        this.scheduleId = scheduleId;
        this.orderId = orderId;
        this.allocationAmount = allocAmount;
        this.status = status;
        this.createdAt = createdAt;
        this.scheduleTime = scheduleTime;
    }
}
