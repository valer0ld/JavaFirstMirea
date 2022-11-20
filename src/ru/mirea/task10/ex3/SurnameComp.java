package ru.mirea.task10.ex3;

import java.util.Comparator;

public class SurnameComp implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
