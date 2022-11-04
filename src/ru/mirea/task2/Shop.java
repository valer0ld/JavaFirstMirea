package ru.mirea.task2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private String[] compList = new String[20];
    private int current = 0;

    public Shop() {
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Введите компьютеры, доступные в магазине(выделенно 20 мест, чтобы остановиться введите 'exit'):");
        while (this.current < this.compList.length)
        {
            line = scan.next();
            if (line.equals("exit")) {
                break;
            }
           this.compList[current] = line;
           current++;
        }
    }

    public void addComp(String newComp)
    {
        if (this.current < this.compList.length)
        {
            this.compList[current] = newComp;
            this.current++;
        }
        else System.out.println("Невозможно добавить комьютер, все места заняты");
    }

    public void delComp(String comp)
    {
        boolean flag = false;
        for(int i = 0; i < this.current; i++)
        {
            if (Objects.equals(this.compList[i], comp))
            {
                compList[i] = null;
                for(int y = i; y < this.current; y++) compList[y] = compList[y + 1];
                this.current--;
                flag = true;
            }
        }
        if (!flag) System.out.println("Комьютера для удаления не нашлось");
    }

    public void findComp(String comp)
    {
        boolean flag = false;
        for(int i = 0; i < this.current; i++)
        {
            if (Objects.equals(this.compList[i], comp))
            {
                System.out.println("Компьютер " + comp + " найден");
                flag = true;
            }
        }
        if (!flag) System.out.println("Комьютера не нашлось");
    }

    @Override
    public String toString() {
        String x = "Shop {";
        for(int i = 0; i < this.current; i++) x = x + ' ' + this.compList[i];
        x += " }";
        return x;
    }
}
