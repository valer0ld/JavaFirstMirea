package ru.mirea.task7;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int xTL, int yTL, int xSpeedTL, int ySpeedTL, int xBR, int yBR, int xSpeedBR, int ySpeedBR) {
        if (!this.SpeedTest()) xSpeedTL = xSpeedBR; ySpeedBR = ySpeedTL;
        this.topLeft = new MovablePoint(xTL, yTL, xSpeedTL, ySpeedTL);
        this.bottomRight = new MovablePoint(xBR, yBR, xSpeedBR, ySpeedBR);
    }

    public boolean SpeedTest()
    {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }


    @Override
    public void moveUp() {
        topLeft.y++;
        topLeft.ySpeed = 1;
        topLeft.xSpeed = 0;
        bottomRight.y++;
        bottomRight.ySpeed = 1;
        bottomRight.xSpeed = 0;
    }

    @Override
    public void moveDown() {
        topLeft.y--;
        topLeft.ySpeed = -1;
        topLeft.xSpeed = 0;
        bottomRight.y--;
        bottomRight.ySpeed = -1;
        bottomRight.xSpeed = 0;
    }

    public void moveRight() {
        topLeft.x++;
        topLeft.xSpeed = 1;
        topLeft.ySpeed = 0;
        bottomRight.x++;
        bottomRight.xSpeed = 1;
        bottomRight.ySpeed = 0;
    }

    @Override
    public void moveLeft() {
        topLeft.x--;
        topLeft.xSpeed = -1;
        topLeft.ySpeed = 0;
        bottomRight.x--;
        bottomRight.xSpeed = -1;
        bottomRight.ySpeed = 0;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft = " + topLeft +
                ", bottomRight = " + bottomRight +
                '}';
    }
}
