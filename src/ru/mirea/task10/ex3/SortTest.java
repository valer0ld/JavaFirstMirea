package ru.mirea.task10.ex3;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortingStudentByGPA sort = new SortingStudentByGPA();
        Students[] ar1 = {new Students("a", "A", "01", "1.2.3", 2), new Students("b", "A", "01", "1.3.3", 2)};
        Students[] ar2 = {new Students("d", "B", "01", "1.3.3", 2), new Students("a", "D", "02", "1.2.3", 1)};
        Students[] ar = new Students[ar1.length + ar2.length];
        System.out.println("ar1: \n" + Arrays.toString(ar1) + '\n' + "ar2: \n" + Arrays.toString(ar2));
        sort.mergeSort(ar, ar1, ar2);
        System.out.println("After sort:\n" + Arrays.toString(ar));
    }
}
