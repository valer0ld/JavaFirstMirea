package ru.mirea.task1;

public class Forth {
    public static void main(String[] args) {
        System.out.println("Гармонический ряд: a(n) = 1/n");
        for(int i = 1; i < 11; i++)
        {
            System.out.print("a(" + i + ") = ");
            System.out.printf("%.3f\n", 1.0/i);
        }
    }
}
