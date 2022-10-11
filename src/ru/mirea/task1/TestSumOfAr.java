package ru.mirea.task1;

public class TestSumOfAr {
    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};
        System.out.print("Массив:"); // Вывод массива
        for(int i: ar) System.out.print(" " + i);
        System.out.println();
        SumOfAr test1 = new SumOfAr(ar);
        test1.printSum(); // Вывод результатов программы
    }
}
