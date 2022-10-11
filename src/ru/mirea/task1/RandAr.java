package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class RandAr {
    public static void main(String[] args) {
        int[] ar = new int[15];
        Random r = new Random();
        for(int i = 0; i < 15; i++) ar[i] = r.nextInt(1000);
        System.out.println("Массив, заполненный рандомными числами с помощью класса Rand: " + Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("Отсортированный массив, заполненный рандомными числами с помощью класса Rand: " + Arrays.toString(ar));
        for(int i = 0; i < 15; i++) ar[i] = (int) (Math.random() * 1000);
        System.out.println("Массив, заполненный рандомными числами с помощью класса Math: " + Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("Отсортированный массив, заполненный рандомными числами с помощью класса Math: " + Arrays.toString(ar));
    }
}
