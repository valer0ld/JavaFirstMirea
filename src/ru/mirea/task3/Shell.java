package ru.mirea.task3;

import java.util.Scanner;

public class Shell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Введите вещественное число: ");
        Double task1 = Double.valueOf(scanner.next());
        System.out.println("task 1: " + task1);
        System.out.print("2. Введите вещественное число: ");
        double task2 = Double.parseDouble(scanner.next());
        System.out.println("task 2: " + task2);
        System.out.println("task 3:\nint: " + task1.intValue() + "\nbyte: " + task1.byteValue()
                + "\nshort: " + task1.shortValue() + "\nlong: " + task1.longValue() + "\nfloat: "
                + task1.floatValue() + "\ndouble: " + task1.doubleValue() + "\nboolean: " +
                !task1.isNaN());
        System.out.println("task 5: " + Double.toString(task2));
    }
}
