package ru.mirea.task12.ex1;

import java.util.Random;

public class Rectangle extends Shape {
    protected int rHeight;
    protected int rWidth;
    public Rectangle(int height, int width) {
        super(height, width);
        Random r = new Random();
        rWidth = r.nextInt(width);
        rHeight = r.nextInt(height);
    }

    public int getRHeight() {
        return rHeight;
    }

    public int getRWidth() {
        return rWidth;
    }
}
