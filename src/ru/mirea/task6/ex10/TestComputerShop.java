package ru.mirea.task6.ex10;

import ru.mirea.task2.Shop;

import java.util.Scanner;

public class TestComputerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ComputerShop test = new ComputerShop();
        System.out.println();
        System.out.print(test.toString() + '\n' + "Введите номер компьютера для удаления: ");
        test.delComp(scan.nextInt());
        System.out.print(test.toString() + '\n' + "Введите компьютер для добавления: ");
        test.addComp();
        System.out.print(test.toString() + '\n' + "Введите номер компьютера для поиска: ");
        test.findComp(scan.nextInt());
    }
}
