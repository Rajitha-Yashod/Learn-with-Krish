package com.FuelManagement.DispatchService.DispatchController;

import com.FuelManagement.DispatchService.DispatchEntity.Dispatch;
import com.FuelManagement.DispatchService.DispatchRepository.DispatchRepository;
import com.FuelManagement.DispatchService.DispatchService.DispatchService;
import com.FuelManagement.DispatchService.DispatchService.OrderService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/dispatchService")
@AllArgsConstructor
@Slf4j
public class DispatchController {
    private final DispatchRepository dispatchRepository;
    private final DispatchService dispatchService;

    @CrossOrigin(origins = "http://localhost:4201")
    @PostMapping("/updateDispatch")
    public void placeOrder(@RequestBody OrderService orderService){
        log.info("New Order Placed {}",orderService.id());
        Integer id = orderService.id();
        Boolean isDispatch = orderService.isDispatch();
        Dispatch dispatch = dispatchRepository.getOne(id);
        if(isDispatch == false){
            dispatch.setStatus("Order Dispatched");
            dispatch.setDispatched(true);
            dispatchRepository.save(dispatch);
        }
        log.info("New Order has been Placed {}",id);
    }

    @CrossOrigin(origins = "http://localhost:4201")
    @GetMapping("/getAll")
    public List<Dispatch> getOrders(){
        return dispatchRepository.findAllByIdDESC();
    }
}
