package ru.mirea.task7;

public class MathFunc implements MathCalculable{
    @Override
    public double power(double num, double power) {
        return Math.pow(num, power);
    }

    @Override
    public double module(double x, double y) {
        return power((x*x + y*y), 0.5);
    }
}
