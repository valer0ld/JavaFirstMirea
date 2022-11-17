package ru.mirea.task8.ex2;

public class FromOneToN {
    public static void main(String[] args) {
        from1ToNVer2(14);
    }

    public static int from1ToN(int n, int currentN)
    {
        System.out.print(currentN + " ");
        if (currentN == n) return 0;
        else return from1ToN(n, currentN + 1);
    }

    public static void from1ToNVer2(int n)
    {
        if (n == 1) System.out.print(n);
        else
        {
            from1ToNVer2(n - 1);
            System.out.print(" " + n);
        }
    }
}
