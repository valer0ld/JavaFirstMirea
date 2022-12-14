package ru.mirea.task21.ex23;

import java.util.ArrayList;
import java.util.List;

public class allTypeList {//<T extends List<?>>{
    private Object[] list;
    private int size;

    public allTypeList() {
        list = new Object[10];
        size = 0;
    }

    public void add(Object e) {
        if (size < list.length) {
            list[size] = e;
        } else {
            Object[] T = new Object[list.length * 2];
            System.arraycopy(list, 0, T, 0, list.length);
            T[size] = e;
            list = T;
        }
        ++size;
    }

    public Object get(int index) {
        if (index >= size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        return (Object)list[index];
    }

    public int getSize() { return this.size;}
}