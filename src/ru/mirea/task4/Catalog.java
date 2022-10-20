package ru.mirea.task4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public enum Catalog {
    Куртки(1),
    Брюки(2),
    Футболки(3);
    private final int num;

    Catalog(int num) {
        this.num = num;
    }

}