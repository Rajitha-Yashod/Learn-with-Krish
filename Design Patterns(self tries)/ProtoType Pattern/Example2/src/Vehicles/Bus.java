package Vehicles;

public class Bus extends Vehicle{
    private int noOfSeat;

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "noOfSeat=" + noOfSeat +
                '}';
    }
}
