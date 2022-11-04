package ru.mirea.task6;

public class K extends TemperatureMeasurer{
    @Override
    public double convert(C c1) {
        return c1.getValue() + 273.15;
    }
}
