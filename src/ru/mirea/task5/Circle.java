package ru.mirea.task5;

import java.util.Random;

public class Circle extends Shape{
    protected int r;

    public Circle(int height, int width) {
        super(height, width);
        Random r = new Random();
        this.r = r.nextInt(Math.min(height, width));
    }

    public int getR() {
        return r;
    }
}
