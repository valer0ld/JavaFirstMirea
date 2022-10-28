package ru.mirea.task4;

public class TestMatrix {
    public static void main(String[] args) {
        double[][] ar1 = {{1, 4},{2, 5}};
        double[][] ar2 = {{-3, 2},{6, -1}};
        Matrix a = new Matrix(ar1, 2, 2);
        Matrix b = new Matrix(ar2, 2, 2);
        System.out.println("A:");
        a.matrixOutput();
        System.out.println("B:");
        b.matrixOutput();
        a.matrixSum(b);
        System.out.println("A:");
        a.matrixOutput();
        System.out.println("A * 3:");
        a.multNumb(3);
        a.matrixOutput();
        System.out.println("A * B:");
        a.multMatrix(b);
        a.matrixOutput();
    }
}
