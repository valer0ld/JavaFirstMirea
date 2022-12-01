package ru.mirea.task19.ex2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LabClassUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LabClass labClass = new LabClass();
        Comparator[] comp = {new SortingStudentByGPA(), new SortingStudentByName()};
        System.out.println(labClass);
        int sw = 0;
        System.out.println("\nВыполнить сортировку - 1\nВыполнить поиск - 2");
        try {
            sw = Integer.parseInt(scanner.next());
            if (sw != 1 && sw != 2)
            {
                throw new Exception();
            }
        } catch (Exception e)
        {
            System.out.println("Необходимо ввести 1 или 2");
        }
        switch (sw)
        {
            case 1:
                LabClassDriver.quickSort(labClass.ar, 0, labClass.ar.length - 1);
                System.out.println("After sort:\n" + Arrays.toString(labClass.ar));
                break;
            case 2:
                try {
                    System.out.print("Введите имя для поиска: ");
                    Students studentsToFind = new Students(scanner.next(), 0);
                    try {
                        if (studentsToFind.getName().equals("")) throw new EmptyStringException("пустая строка!");
                    } catch (EmptyStringException ex) {System.out.println("Неверный ввод!");}
                    boolean flag = true;
                    for(int i = 0; i < 5; i++)
                    {
                        if (comp[1].compare(labClass.ar[i], studentsToFind) == 0) {
                            System.out.println("Ученик нашёлся - " + labClass.ar[i].toString());
                            flag = false;
                        }
                    }
                    if (flag) throw new NotFoundException("Студента не нашлось!");
                } catch (NotFoundException nfe) {
                    System.out.println("Поиск не удался!");
                }
        }
    }
}
