package ru.mirea.task3;

import java.util.Arrays;
import java.util.Random;

public class RandDouble {
    public static void main(String[] args) {
        double[] ar = new double[15];
        Random r = new Random();
        for(int i = 0; i < 15; i++) ar[i] = Math.round(r.nextDouble(1000) * 1000)/1000.0;
        System.out.println("Массив, заполненный рандомными числами с помощью класса Rand:\n" + Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("Отсортированный массив, заполненный рандомными числами с помощью класса Rand:\n" + Arrays.toString(ar));
        for(int i = 0; i < 15; i++) ar[i] = Math.round(Math.random() * 1000 * 1000) / 1000.0;
        System.out.println("Массив, заполненный рандомными числами с помощью класса Math:\n" + Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("Отсортированный массив, заполненный рандомными числами с помощью класса Math:\n" + Arrays.toString(ar));
    }
}
