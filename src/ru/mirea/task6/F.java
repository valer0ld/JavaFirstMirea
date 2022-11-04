package ru.mirea.task6;

public class F extends TemperatureMeasurer{

    @Override
    public double convert(C c1) {
        return (c1.getValue() * 4.5) + 32;
    }
}
