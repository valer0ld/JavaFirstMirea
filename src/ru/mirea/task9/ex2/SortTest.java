package ru.mirea.task9.ex2;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortingStudentByGPA comp = new SortingStudentByGPA();
        Students[] ar = new Students[5];
        System.out.println("print NAME + MARK");
        for (int i = 0; i < 5; i++) {
            System.out.print("Student " + (i+1) + ": ");
            ar[i] = new Students(scanner.next(), scanner.nextDouble());
        }
        System.out.println(Arrays.toString(ar));
        comp.quickSort(ar, 0, ar.length - 1);
        System.out.println("After sort:\n" + Arrays.toString(ar));
    }
}
