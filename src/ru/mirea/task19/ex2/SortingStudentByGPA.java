package ru.mirea.task19.ex2;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return Double.compare(o1.getMark(), o2.getMark());
    }
}
