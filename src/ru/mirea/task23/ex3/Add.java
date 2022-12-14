package ru.mirea.task23.ex3;

public class Add <T extends Const, V extends Const> extends Variable{

    public Add(T t, V v)
    {
        super("+");
    }
}
