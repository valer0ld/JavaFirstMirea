package ru.mirea.task23.ex2;

public interface Queue {

    public boolean isFull();

    public boolean isEmpty();

    public void add(int t);

    public int pop();

    public void printQ();

    public void clear();

    public int size();

    public int element();
}
