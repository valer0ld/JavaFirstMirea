package ru.mirea.task6.ex10;

import java.util.Scanner;

public class Processor {
    public int coreNumber;
    public double frequency;

    public Processor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ядер: ");
        this.coreNumber = scanner.nextInt();
        System.out.print("Введите частоту процессора: ");
        this.frequency = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return "Processor{" +
                "coreNumber=" + coreNumber +
                ", frequency=" + frequency +
                '}';
    }
}
