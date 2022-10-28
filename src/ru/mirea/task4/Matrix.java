package ru.mirea.task4;

import java.util.Arrays;

public class Matrix {
    private double[][] ar = new double[15][15];
    private int column;
    private int row;

    public Matrix(double[][] ar, int column, int row) {
        this.ar = ar;
        this.column = column;
        this.row = row;
    }

    public Matrix(Matrix A)
    {
        this.column = A.column;
        this.row = A.row;
        this.ar = new double[15][15];
        for (int x = 0; x < this.row; x++) {
            for (int y = 0; y < this.column; y++) this.ar[x][y] = A.ar[x][y];
        }
    }

    public void matrixSum(Matrix B) {
        if (this.row == B.row && this.column == B.column) {
            for (int x = 0; x < this.row; x++) {
                for (int y = 0; y < this.column; y++) {
                    this.ar[x][y] += B.ar[x][y];
                }
            }
        }
    }

    public void multNumb(int numb) {
        for (int x = 0; x < this.row; x++) {
            for (int y = 0; y < this.column; y++) {
                this.ar[x][y] *= numb;
            }
        }
    }

    public void matrixOutput()
    {
        for (int x = 0; x < this.row; x++) {
            for (int y = 0; y < this.column; y++) {
                System.out.print(this.ar[x][y]);
                if (y != this.column - 1) System.out.print(" ");
            }
            System.out.print('\n');
        }
    }

    public void multMatrix(Matrix B) {
        Matrix C = new Matrix(this);
        if (this.column == B.row) {
            for (int x = 0; x < this.row; x++) {
                for (int y = 0; y < this.column; y++) {
                    this.ar[x][y] = 0;
                    for (int z = 0; z < this.column; z++) this.ar[x][y] += C.ar[x][z] * B.ar[z][y];
                }
            }
        }
    }
}
