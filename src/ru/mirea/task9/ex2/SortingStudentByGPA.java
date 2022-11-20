package ru.mirea.task9.ex2;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return Double.compare(o1.getMark(), o2.getMark());
    }

    public void quickSort(Students[] ar, int from, int to)
    {
        if (from < to) {

            int divideIndex = partition(ar, from, to);

            quickSort(ar, from, divideIndex - 1);

            quickSort(ar, divideIndex, to);
        }
    }

    private int partition(Students[] ar, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        Students pivot = ar[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (this.compare(ar[leftIndex],pivot) > 0) {
                leftIndex++;
            }

            while (this.compare(ar[rightIndex],pivot) < 0) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                Students tmp  = ar[leftIndex]; ar[leftIndex] = ar[rightIndex]; ar[rightIndex] = tmp;
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
}
