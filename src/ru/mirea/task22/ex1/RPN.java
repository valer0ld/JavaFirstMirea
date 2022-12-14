package ru.mirea.task22.ex1;

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class RPN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение в постфиксном виде(между числами и знаками ставьте пробелы): ");
        String ex = scanner.nextLine(), t;
        Stack<Double> stack = new Stack<>();
        StringTokenizer token = new StringTokenizer(ex);
        while(token.hasMoreTokens())
        {
            t = token.nextToken();
            if (t.equals("+") || t.equals("-") || t.equals("/") || t.equals("*"))
            {
                if(stack.size() < 2)
                {
                    System.out.println("Ошибка выражения, стэк пуст");
                    System.exit(1);
                }
                double a = stack.pop(), b = stack.pop();
                switch (t) {
                    case "+" ->  stack.add(a + b);
                    case "-" -> stack.add(a - b);
                    case "/" -> stack.add(a / b);
                    case "*" -> stack.add(a * b);
                }
            }
            else stack.add(Double.parseDouble(t));
        }
        System.out.println("Результат выражения - " + stack.pop());
    }
}
