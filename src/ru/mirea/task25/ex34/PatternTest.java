package ru.mirea.task25.ex34;

import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        Pattern pattern3 = Pattern.compile("((1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][1-9]|[0-9])" +
                "(\\.)(1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][1-9]|[0-9])" +
                "(\\.)(1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][1-9]|[0-9])" +
                "(\\.)(1[0-9][0-9]|2[0-4][0-9]|25[0-5]|[1-9][1-9]|[0-9])(\\.)?)");
        System.out.println("\nЗадание 3:\n");
        System.out.println("Регулярное выражение совпало с верным примером: - " + pattern3.matcher("127.0.0.1").matches());
        System.out.println("Регулярное выражение совпало с неправильным примером: - " + pattern3.matcher("1300.6.7.8").matches());
        System.out.println("\nЗадание 4:\n");
        System.out.println("Верное выражение: - " + skob("(3*+*5)*–*9*×*4"));
        System.out.println("Неверное выражение: - " + skob("((3*+*5)*–*9*×*4"));
    }
    public static boolean skob(String s)
    {
        int sumOp = 0; // число открытых скобок
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '(' || sumOp > 0)
            {
                if (s.charAt(i) == ')') sumOp--;
                else if (s.charAt(i) == '(') sumOp++;
            }
        }
        return sumOp == 0;
    }
}
