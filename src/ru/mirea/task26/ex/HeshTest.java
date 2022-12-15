package ru.mirea.task26.ex;

import java.util.Scanner;

public class HeshTest {
    public static void main(String[] args) {
        int M = 10;
        Record[] records = new Record[M];
        for(int i = 0; i < M; i++) records[i] = new Record(i+13, "aaa");
        HeshTable table = new HeshTable();
        table.heshCreateTable(M / 2);
        for(int i = 0; i < M; i++)
        {
            table.heshInsert(records[i].key, i);
        }
        table.heshOutput();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой ключ найти?");
        int ind = table.heshFind(scanner.nextInt()).ind;
        System.out.println("Запись найденная по ключу: " + records[ind].key + "  " + records[ind].Value);
        System.out.println("Какой ключ удалить?");
        table.heshDel(scanner.nextInt());
        System.out.println("После удаления:");
        table.heshOutput();
    }
}
