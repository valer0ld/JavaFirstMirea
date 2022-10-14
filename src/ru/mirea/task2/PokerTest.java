package ru.mirea.task2;

import java.util.Scanner;

public class PokerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Сколько будет играть людей: ");
        n = sc.nextInt();
        Poker game = new Poker(n);
        game.razdacha();
    }
}
