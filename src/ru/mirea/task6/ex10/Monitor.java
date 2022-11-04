package ru.mirea.task6.ex10;

import java.util.Scanner;

public class Monitor {
    public String diagonal;
    public String ratio;
    public String resolution;

    public Monitor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Диагональ монитора: ");
        this.diagonal = scanner.next();
        System.out.print("Соотношение сторон: ");
        this.ratio = scanner.next();
        System.out.print("Разрешение монитора: ");
        this.resolution = scanner.next();
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal='" + diagonal + '\'' +
                ", ratio='" + ratio + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
