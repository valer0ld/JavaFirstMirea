package ru.mirea.task19.ex2;

public class LabClassDriver {
    public static void quickSort(Students[] ar, int from, int to)
    {
        if (from < to) {

            int divideIndex = partition(ar, from, to);

            quickSort(ar, from, divideIndex - 1);

            quickSort(ar, divideIndex, to);
        }
    }

    private static int partition(Students[] ar, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        SortingStudentByGPA comp = new SortingStudentByGPA();

        Students pivot = ar[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {

            while (comp.compare(ar[leftIndex],pivot) > 0) {
                leftIndex++;
            }

            while (comp.compare(ar[rightIndex],pivot) < 0) {
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
