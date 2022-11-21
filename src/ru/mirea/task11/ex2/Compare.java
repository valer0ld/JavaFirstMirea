package ru.mirea.task11.ex2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в виде: dd.MM.yyyy, HH:mm:ss");
        try
        {
            Date input = format.parse(scanner.nextLine());
            Date now = new Date();
            if (now.compareTo(input) > 0) System.out.println("Введённая дата меньше текущей: " + format.format(now) +
                    " (текущая)\n" + format.format(input) + " (введённая)");
            else if (now.compareTo(input) < 0) System.out.println("Введённая дата больше текущей: " + format.format(now) +
                    " (текущая)\n" + format.format(input) + " (введённая)");
            else System.out.println("Введённая дата равна текущей: " + format.format(now) +
                        " (текущая)\n" + format.format(input) + " (введённая)");
        }
        catch (ParseException e)
        {
            System.out.println("Неправильный формат ввода!");
            e.printStackTrace();
        }
    }
}
