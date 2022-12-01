package ru.mirea.task19.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LabClass {

    public Students[] ar = new Students[5];

    LabClass()
    {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("print NAME + MARK(5 students)");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i+1) + ": ");
            try {
                name = scanner.next();
                if (name.equals("")) throw new EmptyStringException("пустая строка!");
            } catch (EmptyStringException ex) {System.out.println("Неверный ввод!");}
            ar[i] = new Students(name, scanner.nextDouble());
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(ar);
    }
}
