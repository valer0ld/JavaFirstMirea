package ru.mirea.task20.ex4;

public class Calculator {
    public  static <S extends Number, U extends Number> Number sum (S first, U second)
    {
        return first.doubleValue() + second.doubleValue();
    }
    public  static <S extends Number, U extends Number> Number mul (S first, U second)
    {
        return first.doubleValue() * second.doubleValue();
    }
    public  static <S extends Number, U extends Number> Number div (S first, U second)
    {
        return first.doubleValue() / second.doubleValue();
    }
    public  static <S extends Number, U extends Number> Number sub (S first, U second)
    {
        return first.doubleValue() - second.doubleValue();
    }
}
