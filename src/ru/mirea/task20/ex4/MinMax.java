package ru.mirea.task20.ex4;

import java.util.Comparator;

public class MinMax <T extends Comparator<T>>{
    private final T[] tAr;

    public MinMax(T[] tAr) {
        this.tAr = tAr;
    }

    public T minAr(Comparator<T> comp)
    {
        T m = null;
        for (T t : tAr) {
            if (m == null) m = t;
            m = (comp.compare(m, t) < 0) ? m : t;
        }
        return m;
    }

    public T maxAr(Comparator<T> comp)
    {
        T m = null;
        for (T t : tAr) {
            if (m == null) m = t;
            m = (comp.compare(m, t) > 0) ? m : t;
        }
        return m;
    }
}
