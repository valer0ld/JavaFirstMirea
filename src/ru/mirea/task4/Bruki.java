package ru.mirea.task4;

public enum Bruki {
    СиниеБрюки(17.8),
    ЧёрныеБрюки(24.6),
    УзкиеБрюки(30.5);

    private final double cost;

    Bruki(double cost)
    {
        this.cost = cost;
    }

    public double getCost()
    {
        return this.cost;
    }

}
