package ru.mirea.task9.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortingStudentByGPA comp = new SortingStudentByGPA();
        Students[] ar1 = {new Students("A", 4.2), new Students("B", 2.5), new Students("C", 4.5)};
        Students[] ar2 = {new Students("D", 3.0), new Students("E", 4.1)};
        Students[] ar = new Students[ar1.length + ar2.length];
        System.out.println("ar1: " + Arrays.toString(ar1) + '\n' + "ar2: " + Arrays.toString(ar2));
        comp.mergeSort(ar, ar1, ar2);
        System.out.println("After sort:\n" + Arrays.toString(ar));
    }
}
