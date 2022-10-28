package ru.mirea.task4;

public class Car extends Transport{
    protected int seats;
    protected double capacityOfTrunk; // in kg

    public Car() {
        this.seats = 4;
        this.capacityOfTrunk = 150.0;
    }

    public Car(double fuelCost, double fuelConsumption, double averagespeed) {
        this();
        this.fuelCost = fuelCost;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averagespeed;
    }

    public Car(int seats, double capacityOfTrunk) {
        this.seats = seats;
        this.capacityOfTrunk = capacityOfTrunk;
    }

    public Car(double fuelCost, double fuelConsumption, double averageSpeed, int seats, double capacityOfTrunk) {
        super(fuelCost, fuelConsumption, averageSpeed);
        this.seats = seats;
        this.capacityOfTrunk = capacityOfTrunk;
    }

    @Override
    public double costForKg(double distance) {
        return Math.ceil(fullCost(distance)/(seats * 70.0 + capacityOfTrunk)*100)/100; // average weight of man is 70.0 kg
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", capacityOfTrunk=" + capacityOfTrunk +
                ", fuelCost=" + fuelCost +
                ", fuelConsumption=" + fuelConsumption +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
