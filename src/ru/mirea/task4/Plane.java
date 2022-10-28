package ru.mirea.task4;

public class Plane extends Transport{
    protected int seats;
    protected double capacityOfTrunk;

    public Plane() {
        this.seats = 150;
        this.capacityOfTrunk = 2700.0;
    }

    public Plane(double fuelCost, double fuelConsumption, double averageSpeed) {
        this();
        this.fuelCost = fuelCost;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averageSpeed;
    }

    public Plane(int seats, double capacityOfTrunk) {
        this.seats = seats;
        this.capacityOfTrunk = capacityOfTrunk;
    }

    public Plane(double fuelCost, double fuelConsumption, double averageSpeed, int seats, double capacityOfTrunk) {
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
        return "Plane{" +
                "seats=" + seats +
                ", capacityOfTrunk=" + capacityOfTrunk +
                ", fuelCost=" + fuelCost +
                ", fuelConsumption=" + fuelConsumption +
                ", averageSpeed=" + averageSpeed +
                '}';
    }
}
