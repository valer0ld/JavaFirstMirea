package ru.mirea.task11.ex1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstDate {
    public static void main(String[] args) {
        String name = "Petsinyarzh";
        Calendar dateBegin = new GregorianCalendar(2022, Calendar.SEPTEMBER, 1);
        dateBegin.set(Calendar.HOUR_OF_DAY, 9);
        dateBegin.set(Calendar.MINUTE, 0);
        dateBegin.set(Calendar.SECOND, 1);
        DateFormat sdf = new SimpleDateFormat("dd.MM.yyyy, HH:mm:ss");
        Date now = new Date();
        System.out.println("Разработчик - " + name + '\n' + "Задание получено: " + sdf.format(dateBegin.getTime()) +
                '\n' + "Задание сдано: " + sdf.format(now));
    }
}