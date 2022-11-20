package ru.mirea.task10.ex3;

import java.util.Comparator;

public class CourseComp implements Comparator<Students> {
    @Override
    public int compare(Students o1, Students o2) {
        return Integer.compare(o1.getCourse(), o2.getCourse());
    }
}
