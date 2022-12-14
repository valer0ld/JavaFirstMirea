package ru.mirea.task23.ex3;

public class Subtract <T extends Const, V extends Const> extends Variable{
    public Subtract(T t, V v)
    {
        super("-");
    }
}
