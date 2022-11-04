package ru.mirea.task7;

public class TestString {
    public static void main(String[] args) {
        String s = "abcd";
        StringFunc func = new RealizationOfStringFunction();
        System.out.println("length: " + func.length(s) + "\nOdd String: " + func.oddString(s) + "\nInvert String: " + func.invert(s));
    }
}
