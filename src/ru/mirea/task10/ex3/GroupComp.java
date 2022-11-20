package ru.mirea.task10.ex3;

import java.util.Comparator;

public class GroupComp implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getGroup().compareTo(o2.getGroup());
    }
}
