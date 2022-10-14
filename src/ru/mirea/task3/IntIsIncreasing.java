package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;

public class IntIsIncreasing {
    public static void main(String[] args) {
        int[] ar = new int[4];
        int prev = 0;
        Random r = new Random();
        boolean flag = true;
        for (int i = 0; i < 4; i++)
        {
            ar[i] = r.nextInt(89) + 10;
            if (prev > ar[i]) flag = false;
            prev = ar[i];
        }
        System.out.print(Arrays.toString(ar) + "\nМассив ");
        if (!flag) System.out.print("не ");
        System.out.print("является строго возрастающей последовательностью.");
    }
}
