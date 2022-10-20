package ru.mirea.task4;

public enum Futbolki {
    ФиолетоваяФутболка(12.9),
    ЖелтаяФутболка(8.6),
    КраснаяФутболка(5.7);

    private final double cost;

    Futbolki(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return this.cost;
    }

}
