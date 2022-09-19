package com.FuelManagement.DispatchService.DispatchEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
public class Dispatch {
    @Id
    @SequenceGenerator(
            name = "DispatchIdSequence",
            sequenceName = "DispatchIdSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "DispatchIdSequence"
    )
    private Integer dispatchId;
    private Integer orderId;
    private String status;
    private Integer allocAmount;
    private LocalDateTime createdAt;
    private LocalDateTime dispatchAt;
    private Boolean isDispatched;

    public Dispatch() {
    }

    public Integer getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Integer dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAllocAmount() {
        return allocAmount;
    }

    public void setAllocAmount(Integer allocAmount) {
        this.allocAmount = allocAmount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDispatchAt() {
        return dispatchAt;
    }

    public void setDispatchAt(LocalDateTime dispatchAt) {
        this.dispatchAt = dispatchAt;
    }

    public Boolean getDispatched() {
        return isDispatched;
    }

    public void setDispatched(Boolean dispatched) {
        isDispatched = dispatched;
    }

    public Dispatch(Integer dispatchId, Integer orderId, String status, Integer allocAmount, LocalDateTime createdAt, LocalDateTime dispatchAt, Boolean isDispatched) {
        this.dispatchId = dispatchId;
        this.orderId = orderId;
        this.status = status;
        this.allocAmount = allocAmount;
        this.createdAt = createdAt;
        this.dispatchAt = dispatchAt;
        this.isDispatched = isDispatched;
    }
}
