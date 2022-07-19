package FactoryPattern;

public class LuxuryCar extends Car{

    LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building a Luxury Car.");
    }

}
