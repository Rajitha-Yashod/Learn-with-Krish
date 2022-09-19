package com.FuelManagement.OrderService.OrderEntiry;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Order {
    @Id
    @SequenceGenerator(
            name = "OrderIDSequence",
            sequenceName = "OrderIdSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orderIdSequence"
    )
    private Integer orderID;
    private Integer allocationAmount;
    private String status;
    private LocalDateTime createAt;

}
