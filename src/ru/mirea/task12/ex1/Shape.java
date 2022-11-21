package ru.mirea.task12.ex1;

import java.awt.*;
import java.util.Random;

public abstract class Shape {
    protected int posX;
    protected int posY;
    protected Color color;

    public Shape(int height, int width)
    {
        Random r = new Random();
        posX = r.nextInt(width);
        posY = r.nextInt(height);
        color = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public Color getColor() {
        return color;
    }
}
