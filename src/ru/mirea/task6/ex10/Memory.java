package ru.mirea.task6.ex10;

import java.util.Scanner;

public class Memory {
    public int capacity;

    public Memory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ёскость памяти: ");
        this.capacity = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Memory{" +
                "capacity=" + capacity +
                '}';
    }
}
