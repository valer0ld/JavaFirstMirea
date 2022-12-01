package ru.mirea.task19.ex2;

import java.util.Comparator;

public class SortingStudentByName implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
