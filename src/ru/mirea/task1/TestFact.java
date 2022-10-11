package ru.mirea.task1;

import java.util.Scanner;

public class TestFact {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Факториал какого числа вычислить?");
        int num = console.nextInt();
        Fact test = new Fact(num);
        System.out.printf("%d! = %d", num, test.calc());
    }
}
