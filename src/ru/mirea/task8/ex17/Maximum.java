package ru.mirea.task8.ex17;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел, чтобы закончить ввод введите 0.");
        System.out.println("Максмум - " + recMax());
    }
    public static int recMax()
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t == 0) return t;
        return Math.max(recMax(), t);
    }
}
