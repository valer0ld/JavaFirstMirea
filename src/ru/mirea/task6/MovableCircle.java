package ru.mirea.task6;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.y++;
        center.ySpeed = 1;
        center.xSpeed = 0;
    }

    @Override
    public void moveDown() {
        center.y--;
        center.ySpeed = -1;
        center.xSpeed = 0;
    }

    public void moveRight() {
        center.x++;
        center.xSpeed = 1;
        center.ySpeed = 0;
    }

    @Override
    public void moveLeft() {
        center.x--;
        center.xSpeed = -1;
        center.ySpeed = 0;
    }
}
