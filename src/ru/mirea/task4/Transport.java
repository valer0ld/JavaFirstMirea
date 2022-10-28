package ru.mirea.task4;

public abstract class Transport {
    protected double fuelCost; // 1 литр в рублях
    protected double fuelConsumption; // литров в километр
    protected double averageSpeed; // км в ч

    public Transport() {
        this.fuelCost = 1.0;
        this.fuelConsumption = 1.0;
        this.averageSpeed = 10.0;
    }

    public Transport(double fuelCost, double fuelConsumption, double averagespeed) {
        this.fuelCost = fuelCost;
        this.fuelConsumption = fuelConsumption;
        this.averageSpeed = averagespeed;
    }

    public double travelTime(double distance) {return Math.ceil(distance/averageSpeed*100)/100;}

    public double fullCost(double distance)
    {
        return distance * fuelConsumption * fuelCost;
    }

    public abstract double costForKg(double distance);

    public abstract String toString();
}
