package com.FuelManagement.AllocationService.Repository;

import com.FuelManagement.AllocationService.AllocationEntiry.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StockRepository extends JpaRepository<Stock,Integer> {

    @Query(nativeQuery = true,value = "SELECT*FROM stock ORDER BY id DESC LIMIT 1")
    public List<Stock> findByIdDESC();
}
