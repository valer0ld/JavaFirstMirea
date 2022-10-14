package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForthArray {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        do {
            n = scanner.nextInt();
            if (n < 1) System.out.println("Введите натуральное число( > 1 )");
        } while (n < 1);
        Random r = new Random();
        int[] ar1 = new int[n];
        int[] ar2 = new int[n];
        int ar2Current = 0;
        for (int i = 0; i < n; i++)
        {
            ar1[i] = r.nextInt(n);
            if (ar1[i] % 2 == 0)
            {
                ar2[ar2Current] = ar1[i];
                ar2Current++;
            }
        }
        System.out.println("ar1: " + Arrays.toString(ar1));
        if (ar2Current > 0) {
            System.out.print("ar2: [ ");
            for (int y = 0; y < ar2Current; y++) System.out.print(ar2[y] + " ");
            System.out.println(']');
        }
        else System.out.println("Чётных чисел нет.");
    }
}
