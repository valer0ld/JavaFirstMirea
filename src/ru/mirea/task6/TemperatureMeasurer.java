package ru.mirea.task6;

public abstract class TemperatureMeasurer implements Convertable{
    private double value;

    public abstract double convert(C c1);

    public double getValue() {
        return value;
    }
}
