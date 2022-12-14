package ru.mirea.task23.ex3;

public class Test {
    public static void main(String[] args) {
        System.out.println("");
        double d = new Subtract(new Multiply(new Const("2"), new Variable("x")), new Const("3")).evaluate(5);
        System.out.println("ответ = " + d);
        double d1 = new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const("2"), new Variable("x"))), new Const("1")).evaluate(1);
        System.out.println("ответ = " + d1);
    }
}
