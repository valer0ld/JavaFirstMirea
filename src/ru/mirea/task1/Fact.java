package ru.mirea.task1;

public class Fact {
    int x1;
    Fact(int x)
    {
        x1 = x;
    }
    int calc()
    {
      int sum = 1;
      while (x1 > 1) {
          sum *= x1--;
      }
      return sum;
    }
}
