package ru.mirea.task14.ex9;

public class Letter {
    private final String letter;
    private int counter = 0;

    public Letter(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }

    public int getCounter() {
        return counter;
    }

    public void add()
    {
        this.counter++;
    }

    @Override
    public String toString() {
        return  letter + ": " + counter;
    }
}
