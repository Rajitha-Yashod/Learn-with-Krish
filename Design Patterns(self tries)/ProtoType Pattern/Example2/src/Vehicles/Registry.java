package Vehicles;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<VehicleType, Vehicle> vehicle = new HashMap<>();

    public Registry() {
        this.initialize();
    }
    public Vehicle getVehicle(VehicleType vehicleType){
        Vehicle vehicle=null;
        try{
            Vehicle vehicle=(Vehicle)vehicles.get(vehicleType).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return ;
    }


    private void initialize() {
        Car car=new Car();
        car.setEngineCapacity("2000");
        car.setType("Mini");
        car.setFuelType("Gasoline");

        vehicle.put(VehicleType.CAR,car);
    }



}
