package ru.mirea.task3;

/*
Создать мини-Приложение интернет-магазин.
 В приложении рассчитывается стоимость покупки товара,
 где пользователь может выбрать валюту для оплаты товара
*/

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class OnlineStore {
    public static void main(String[] args) {
        Random r = new Random();
        Locale[] country = {Locale.UK, Locale.US, Locale.CANADA, Locale.CHINA,
                Locale.FRANCE, Locale.GERMANY, Locale.ITALY, Locale.JAPAN, Locale.KOREA, Locale.getDefault()};
        double number = r.nextDouble(1000);
        System.out.println("Выберите валюту для оплаты:\n1. UK\n2. US\n3. CANADA\n4. CHINA"
                 + "\n5. FRANCE\n6. GERMANY\n7. ITALY\n8. JAPAN\n9. KOREA\n10. RUSSIA");
        Scanner scanner = new Scanner(System.in);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(country[scanner.nextInt() - 1]);
        System.out.println("Сумма: " + numberFormat.format(number));
    }
}
