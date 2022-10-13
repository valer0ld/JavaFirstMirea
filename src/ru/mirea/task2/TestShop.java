package ru.mirea.task2;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop test = new Shop();
        Scanner scan = new Scanner(System.in);
        System.out.print(test.toString() + '\n' + "Введите компьютер для удаления: ");
        test.delComp(scan.next());
        System.out.print(test.toString() + '\n' + "Введите компьютер для добавления: ");
        test.addComp(scan.next());
        System.out.print(test.toString() + '\n' + "Введите компьютер для поиска: ");
        test.findComp(scan.next());
    }
}
