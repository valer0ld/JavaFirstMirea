package ru.mirea.task2;

public class Circle {
    private double r;
    private double x;
    private double y;

    public Circle(double r, double x, double y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double square()
    {
        return Math.pow(this.r, 2) * Math.PI;
    }

    public double circleLength()
    {
        return 2 * Math.PI * r;
    }

    public boolean compare(Circle t2)
    {
        return this.r == t2.r;
    }

    @Override
    public String toString() {
        return "Circle { " +
                "r = " + r +
                ", x = " + x +
                ", y = " + y +
                " }";
    }
}
