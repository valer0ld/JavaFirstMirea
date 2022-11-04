package ru.mirea.task6;

public class MovablePoint implements Movable{
    public int x;

    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.y++;
        this.ySpeed = 1;
        this.xSpeed = 0;
    }

    @Override
    public void moveDown() {
        this.y--;
        this.ySpeed = -1;
        this.xSpeed = 0;
    }

    public void moveRight() {
        this.x++;
        this.xSpeed = 1;
        this.ySpeed = 0;
    }

    @Override
    public void moveLeft() {
        this.x--;
        this.xSpeed = -1;
        this.ySpeed = 0;
    }
}
