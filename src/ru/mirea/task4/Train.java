package ru.mirea.task4;

public class Train extends Transport{
    protected int numberOfPassengerCar;
    protected int seatsInPassengerCar;
    protected int numberOfFreightCar;
    protected double capacityOfFreightCar;

    public Train() {
        this.numberOfPassengerCar = 8;
        this.seatsInPassengerCar = 54;
        this.numberOfFreightCar = 7;
        this.capacityOfFreightCar = 60000.0;
    }

    public Train(double fuelCost, double fuelConsumption, double averageSpeed) {
        this();
        this.fuelCost = fuelCost;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averageSpeed;
    }

    public Train(int numberOfPassengerCar, int seatsInPassengerCar, int numberOfFreightCar, double capacityOfFreightCar) {
        this.numberOfPassengerCar = numberOfPassengerCar;
        this.seatsInPassengerCar = seatsInPassengerCar;
        this.numberOfFreightCar = numberOfFreightCar;
        this.capacityOfFreightCar = capacityOfFreightCar;
    }

    public Train(double fuelCost, double fuelConsumption, double speed, int numberOfPassengerCar, int seatsInPassengerCar, int numberOfFreightCar, double capacityOfFreightCar) {
        super(fuelCost, fuelConsumption, speed);
        this.numberOfPassengerCar = numberOfPassengerCar;
        this.seatsInPassengerCar = seatsInPassengerCar;
        this.numberOfFreightCar = numberOfFreightCar;
        this.capacityOfFreightCar = capacityOfFreightCar;
    }

    @Override
    public double costForKg(double distance) {
        return Math.ceil(fullCost(distance)/(numberOfPassengerCar * seatsInPassengerCar * 70.0 + numberOfFreightCar * capacityOfFreightCar)* 100)/100; // average weight of man is 70.0 kg
    }

    @Override
    public String toString() {
        return "Train{" +
                "numberOfPassengerCar=" + numberOfPassengerCar +
                ", seatsInPassengerCar=" + seatsInPassengerCar +
                ", numberOfFreightCar=" + numberOfFreightCar +
                ", capacityOfFreightCar=" + capacityOfFreightCar +
                ", fuelCost=" + fuelCost +
                ", fuelConsumption=" + fuelConsumption +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
