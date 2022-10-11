package ru.mirea.task1;

public class SumOfAr {
    int[] arr;
    SumOfAr(int[] ar) // конструктор класса SumOfAr
    {
        arr = ar;
    }
    public int sumFor() // метод вычисления суммы с помощью цикла for
    {
        int sum = 0;
        for(int i: arr) sum += i;
        return sum;
    }
    public int sumWhile() // метод вычисления суммы с помощью цикла while
    {
       int i = 0, sum = 0;
       while(i < arr.length)
       {
           sum += arr[i];
           i++;
       }
       return sum;
    }
    public int sumDo() // метод вычисления суммы с помощью цикла do while
    {
        int i = 0, sum = 0;
        do
        {
            sum += arr[i];
            i++;
        }while(i < arr.length);
        return sum;
    }
    public void printSum() // метод вывода результатов программы
    {
        System.out.println("Сумма вычисленная циклом for: " + sumFor() +
                "\nСумма вычисленная циклом while: " + sumWhile() +
                "\nСумма вычисленная циклом do while: " + sumDo());
    }
}
