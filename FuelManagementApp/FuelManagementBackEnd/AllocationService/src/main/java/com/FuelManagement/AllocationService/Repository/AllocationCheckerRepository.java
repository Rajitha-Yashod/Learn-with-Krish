package com.FuelManagement.AllocationService.Repository;

import com.FuelManagement.AllocationService.AllocationEntiry.AllocationChecker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllocationCheckerRepository extends JpaRepository<AllocationChecker,Long> {
}
