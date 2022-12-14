package ru.mirea.task23.ex3;

import ru.mirea.task23.ex2.Queue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class Const{
    public static java.util.Queue<String> values = new LinkedList<>();

    public Const(String c)
    {
        values.add(c);
    }
}
