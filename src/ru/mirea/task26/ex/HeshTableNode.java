package ru.mirea.task26.ex;

public class HeshTableNode {
    int key, ind;
    boolean isDeleted;
    boolean isOpen;

    public HeshTableNode(int key, int ind, boolean isDeleted, boolean isOpen) {
        this.key = key;
        this.ind = ind;
        this.isDeleted = isDeleted;
        this.isOpen = isOpen;
    }
}
