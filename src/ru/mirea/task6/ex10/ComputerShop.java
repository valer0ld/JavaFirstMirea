package ru.mirea.task6.ex10;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ComputerShop {
    private Computer[] computerList = new Computer[10];
    private int current = 0;

    public ComputerShop() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько компьютеров в магазине?(до " + computerList.length + " шт.)") ;
        this.current = scan.nextInt();
        System.out.println("Введите " + current + " компьютеров, доступных в магазине:");
        for(int i = 0; i < current; i++) {
            System.out.println((i+1) + "-Й КОМПЬЮТЕР:");
            this.computerList[i] = new Computer();
        }
    }

    public void addComp()
    {
        if (this.current < this.computerList.length)
        {
            this.current++;
            this.computerList[current - 1] = new Computer();
        }
        else System.out.println("Невозможно добавить комьютер, все места заняты");
    }

    public void delComp(int num)
    {
        boolean flag = false;
        for(int i = 0; i < this.current; i++)
        {
            if (computerList[i].number == num)
            {
                computerList[i] = null;
                for(int y = i; y < this.current; y++) computerList[y] = computerList[y + 1];
                this.current--;
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Комьютера для удаления не нашлось");
    }

    public void findComp(int num)
    {
        boolean flag = false;
        for(int i = 0; i < this.current; i++)
        {
            if (computerList[i].number == num)
            {
                System.out.println("Компьютер " + num + " найден");
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("Комьютера не нашлось");
    }

    @Override
    public String toString() {
        return "ComputerShop " + Arrays.toString(computerList);
    }

}
