package com.FuelManagement.AllocationService.Controller;

import com.FuelManagement.AllocationService.AllocationEntiry.AllocationChecker;
import com.FuelManagement.AllocationService.AllocationEntiry.Stock;
import com.FuelManagement.AllocationService.Repository.StockRepository;
import com.FuelManagement.AllocationService.Service.AllocationService;
import com.FuelManagement.AllocationService.Service.UpdateStock;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/allocationChecker")
@AllArgsConstructor
public class AllocationController {
    private final AllocationService allocationService;
    private final StockRepository stockRepository;

    @CrossOrigin(origins = "http://hocalhost:4201")
    @PostMapping("/updateStock")
    public void updatedStock(@RequestBody UpdateStock updateStock){
        allocationService.stockUpdate(updateStock);
    }

    @CrossOrigin(origins = "http://localhost:4201")
    @GetMapping("/getAll")
    public List<Stock> getOrders(){
        return stockRepository.findByIdDESC();
    }
}
