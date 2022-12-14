package ru.mirea.task20.ex123;

import java.io.Serializable;

public class FirstGeneric <T extends Comparable<T>, V extends Serializable, K extends Animal>{
    private T t;
    private V v;
    private K k;

    public FirstGeneric(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    @Override
    public String toString() {
        return "FirstGeneric{" +
                "t = " + t + "(" + t.getClass() + ")" +
                ", v=" + v + "(" + v.getClass() + ")" +
                ", k=" + k + "(" + v.getClass() + ")" +
                '}';
    }
}
