package ru.mirea.task1;

public class Third {
    public static void main(String[] args) {
        System.out.print("Аргументы командной строки:");
        for (String arg : args) {
            System.out.print(" " + arg);
        }
    }
}