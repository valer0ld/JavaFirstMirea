package ru.mirea.task26.ex;

public class Record {
    public int key;
    public String Value;

    Record(int key, String value){
        this.key = key;
        this.Value = value;
    }

    @Override
    public String toString() {
        return key +" | " + Value;
    }
}
