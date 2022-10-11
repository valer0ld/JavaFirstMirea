package ru.mirea.task1;

public class First {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 6};
        int sum_el = 0;
        System.out.print("Массив:");
        for(int i: ar) {
            System.out.print(" " + i);
            sum_el += i;
        }
        System.out.println('\n' + "Сумма массива: " + sum_el + '\n' + "Среднее арифметическое: " + (double)sum_el/ar.length);
    }
}
