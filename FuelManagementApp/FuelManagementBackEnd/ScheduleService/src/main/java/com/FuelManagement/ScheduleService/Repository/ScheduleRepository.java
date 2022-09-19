package com.FuelManagement.ScheduleService.Repository;

import com.FuelManagement.ScheduleService.ScheduleEntity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {
}
