package ru.mirea.task8.ex1;

public class Sequence {
    public static void main(String[] args) {
        secOutput(27, 1, 0);
    }

    public static int recSum(int n)
    {
        if (n < 1) return n;
        else return n + recSum(n - 1);
    }
    public static int secOutput(int n, int currentK, int t) // t - счётчик количества раз печати определённого натурального числа
    {
        if((t + recSum(currentK - 1)) == n) return 0;
        System.out.print(currentK + " ");
        if (t == currentK - 1) return secOutput(n, currentK + 1, 0);
        else return secOutput(n, currentK, t + 1);
    }
}
