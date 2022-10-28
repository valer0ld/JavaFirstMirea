package ru.mirea.task4;

public class Square extends Rectangle{
    public Square() {
        this.length = 1;
        this.width = 1;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side)
    {
        this.width = side;
        this.length = side;
    }

    public double getSide()
    {
        return this.length;
    }

    @Override
    public void setWidth(double width) {
        this.length = width;
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side = " + length +
                ", color = '" + color + '\'' +
                ", filled = " + filled +
                '}';
    }
}
