package ru.mirea.task6.ex10;

import java.util.Scanner;

public class Computer {
    public Processor processor;
    public Memory memory;
    public Monitor monitor;
    public Mark mark;
    public int number;

    public Computer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ПРОЦЕССОР");
        processor = new Processor();
        System.out.println("МОНИТОР:");
        monitor = new Monitor();
        System.out.println("ПАМЯТЬ:");
        memory = new Memory();
        System.out.println("МАРКА(AAA, BBB, CCC):");
        mark = Mark.valueOf(scanner.next());
        System.out.println("УНИКАЛЬНЫЙ НОМЕР:");
        number = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Computer(" + number + ") {"  + processor +
                ", " + memory +
                ", " + monitor +
                ", mark = " + mark +
                '}';
    }
}
