package ru.mirea.task11.ex3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudentTest {
    public static void main(String[] args) {
        DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date now = new Date();
        Students students = new Students("Valera", 4.2, now);
        System.out.println(students.toString(formatter));
    }
}
