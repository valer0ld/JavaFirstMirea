package ru.mirea.task2;

public class TestStringReverse {
    public static void main(String[] args) {
        String[] ar = {"a", "b", "c", "d", "e", "f", "g", "j", "k"};
        StringReverse arRev = new StringReverse(ar);
        System.out.println("исх: " + arRev.toString());
        arRev.reverse();
        System.out.println("обратный: " + arRev.toString());
    }
}
