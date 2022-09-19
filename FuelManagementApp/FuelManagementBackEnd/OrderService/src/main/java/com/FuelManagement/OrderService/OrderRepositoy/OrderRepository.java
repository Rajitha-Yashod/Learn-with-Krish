package com.FuelManagement.OrderService.OrderRepositoy;
import com.FuelManagement.OrderService.OrderEntiry.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
