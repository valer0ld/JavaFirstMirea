package ru.mirea.task4;

public enum Kurtki {
    БелаяКуртка(10.5),
    ЖелтаяКуртка(19.6),
    КраснаяКуртка(13.4);

    private final double cost;

    Kurtki(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return this.cost;
    }

}
