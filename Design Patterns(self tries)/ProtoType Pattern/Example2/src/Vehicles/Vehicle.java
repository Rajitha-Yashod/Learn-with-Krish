package Vehicles;

public class Vehicle implements Cloneable {
    private String fuelType;
    private String engineCapacity;

    public String getFuelType() {
        return fuelType;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
