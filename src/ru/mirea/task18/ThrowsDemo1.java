package ru.mirea.task18;

import java.security.KeyException;
import java.util.Scanner;

public class ThrowsDemo1 {
    public void getKey() {
        Scanner myScanner = new  Scanner(System.in);
        String key;
        while(true) {
            try {
                System.out.println("Введите ключ(не равный key)");
                key = myScanner.next();
                if (key.equals("key")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Повторите ввод...");
            }
        }
        printDetails(key);
    }
    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) {
        return "data for " + key;
    }
}
