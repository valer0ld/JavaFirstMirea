package ru.mirea.task1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int[] ar = new int[5];
        Scanner sc = new Scanner(System.in);
        int sum_el = 0, i = 0, max_el, min_el;
        System.out.print("Введите массив(5 элементов): ");
        do {
            ar[i] = sc.nextInt();
            i++;
        } while(i < 5);
        i = 0;
        min_el = ar[0];
        max_el = ar[0];
        System.out.print("Массив:");
        while(i < 5) {
            System.out.print(" " + ar[i]);
            min_el = Math.min(min_el, ar[i]);
            max_el = Math.max(max_el, ar[i]);
            sum_el += ar[i];
            i++;
        }
        System.out.println('\n' + "Сумма массива: " + sum_el + '\n' + "Минимальное значение: " + min_el
                + '\n' + "Максмальное значение: " + max_el);
    }
}
