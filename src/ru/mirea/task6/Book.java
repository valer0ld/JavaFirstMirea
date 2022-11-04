package ru.mirea.task6;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print()
    {
        System.out.println("Book(" + name + ") is printed.");
    }
}
