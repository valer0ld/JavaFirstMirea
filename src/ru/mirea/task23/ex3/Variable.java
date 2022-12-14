package ru.mirea.task23.ex3;

import java.util.Objects;
import java.util.Stack;

public class Variable extends Const{
    private static String var;

    public Variable(String name)
    {
        super(name);
        if(!name.equals("+") && !name.equals("-") && !name.equals("/") && !name.equals("*")) var = name;
    }

    public double evaluate(double x)
    {
        Stack<String> stack = new Stack<>();
        while (!Const.values.isEmpty()) {
            String t = Const.values.poll();
            if (t.equals("+") || t.equals("-") || t.equals("/") || t.equals("*"))
            {
                if(stack.size() < 2)
                {
                    System.out.println("Ошибка выражения, стэк пуст");
                    System.exit(1);
                }
                double a, b;
                String a1 = stack.pop(), b1 = stack.pop();
                a = (a1.equals(var)) ? x : Double.parseDouble(a1);
                b = (b1.equals(var)) ? x : Double.parseDouble(b1);
                switch (t) {
                    case "+" ->  stack.add(Double.toString(b + a));
                    case "-" -> stack.add(Double.toString(b - a));
                    case "/" -> stack.add(Double.toString(b / a));
                    case "*" -> stack.add(Double.toString(b * a));
                }
            }
            else stack.add(t);
        }
        return Double.parseDouble(stack.pop());
    }
}
