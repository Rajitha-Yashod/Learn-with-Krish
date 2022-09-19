package com.FuelManagement.DispatchService.DispatchRepository;

import com.FuelManagement.DispatchService.DispatchEntity.Dispatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DispatchRepository extends JpaRepository<Dispatch,Integer> {
    @Query(nativeQuery = true, value="SELECT * FROM dispatch ORDER BY dispatchId DESC")
    public List<Dispatch> findAllByIdDESC();
}
