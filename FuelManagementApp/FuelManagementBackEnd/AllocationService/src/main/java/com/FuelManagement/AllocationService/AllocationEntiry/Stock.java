package com.FuelManagement.AllocationService.AllocationEntiry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data @Builder
public class Stock {
    @Id
    @SequenceGenerator(
            name="stockIdSequence",
            allocationSize=1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                     generator = "stockIdSequence"
    )
    private Integer id;
    private Integer availableStock;
    private Integer allocatedAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(Integer availableStock) {
        this.availableStock = availableStock;
    }

    public Integer getAllocatedAmount() {
        return allocatedAmount;
    }

    public void setAllocatedAmount(Integer allocatedAmount) {
        this.allocatedAmount = allocatedAmount;
    }
}
