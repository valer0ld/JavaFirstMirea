package ru.mirea.task4;


public class Ship extends Transport{
    protected double capacity;

    public Ship() {
        this.capacity = 50000000.0;
    }

    public Ship(double fuelCost, double fuelConsumption, double averageSpeed) {
        this();
        this.fuelCost = fuelCost;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averageSpeed;
    }

    public Ship(double capacity) {
        this.capacity = capacity;
    }

    public Ship(double fuelCost, double fuelConsumption, double averageSpeed, double capacity) {
        super(fuelCost, fuelConsumption, averageSpeed);
        this.capacity = capacity;
    }

    @Override
    public double costForKg(double distance) {
        return Math.ceil(fullCost(distance)/(capacity) * 100) / 100;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "capacity=" + capacity +
                ", fuelCost=" + fuelCost +
                ", fuelConsumption=" + fuelConsumption +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
