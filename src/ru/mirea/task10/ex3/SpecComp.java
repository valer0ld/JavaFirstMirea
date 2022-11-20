package ru.mirea.task10.ex3;

import java.util.Comparator;

public class SpecComp implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getSpec().compareTo(o2.getSpec());
    }
}
