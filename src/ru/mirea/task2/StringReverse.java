package ru.mirea.task2;

import java.util.Arrays;

public class StringReverse {
    private String[] ar = new String[10];

    public StringReverse(String[] ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return Arrays.toString(ar);
    }

    public void reverse()
    {
        String t;
        for (int i = 0; i < ar.length / 2; i++)
        {
            t= ar[i];
            ar[i] = ar[ar.length - 1 - i];
            ar[ar.length - 1 - i] = t;
        }
    }
}
