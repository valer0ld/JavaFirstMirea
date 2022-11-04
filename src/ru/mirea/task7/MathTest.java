package ru.mirea.task7;

import java.sql.SQLOutput;

public class MathTest {
    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println("Площадь круга с радиусом 2 равна - " + mc.PI * mc.power(2, 2));
        System.out.println("Модуль комплексного числа 2 + i - " + mc.module(2, 1));
    }
}
