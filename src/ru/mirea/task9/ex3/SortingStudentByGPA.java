package ru.mirea.task9.ex3;

import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Students> {

    @Override
    public int compare(Students o1, Students o2) {
        return Double.compare(o1.getMark(), o2.getMark());
    }

    public void mergeSort(Students[] ar, Students[] ar1, Students[] ar2) // ar - пустой массив, в который запишутся отсортированные два массива
    {
        int ar1Length = ar1.length, ar2Length = ar2.length;
        quickSort(ar1, 0, ar1Length - 1);
        quickSort(ar2, 0, ar2Length - 1);
        int i = 0, j = 0;
        while (i + j < ar.length)
        {
            if (i == ar1Length) {
                while (j != ar2Length)
                {
                    ar[i + j] = ar2[j];
                    j++;
                }
            }
            else if (j == ar2Length) {
                while (i != ar1Length)
                {
                    ar[i + j] = ar1[i];
                    i++;
                }
            }
            else if (this.compare(ar1[i], ar2[j]) >= 0) {
                ar[i + j] = ar1[i];
                i++;
            }
            else {
                ar[i + j] = ar2[j];
                j++;
            }
        }
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
