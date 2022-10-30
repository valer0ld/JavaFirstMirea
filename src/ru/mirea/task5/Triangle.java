package ru.mirea.task5;

import java.util.Random;

public class Triangle extends Shape{
    protected int[] xDot;
    protected int[] yDot;

    public Triangle(int height, int width) {
        super(height, width);
        Random r = new Random();
        this.xDot = new int[3];
        this.yDot = new int[3];
        xDot[0] = r.nextInt(width);
        yDot[0] = r.nextInt(height);
        xDot[1] = r.nextInt(width);
        yDot[1] = r.nextInt(height);
        xDot[2] = r.nextInt(width);
        yDot[2] = r.nextInt(height);
    }

    public int[] getXDot() {
        return xDot;
    }

    public int[] getYDot() {
        return yDot;
    }
}
