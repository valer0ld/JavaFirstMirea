package ru.mirea.task27.ex2;

public class TestMap {
    public static void main(String[] args) {
        Map map = new Map();
        map.createMap();
        System.out.println("Повторяющихся фамилий - " + map.getSameLastNameCount());
        System.out.println("Повторяющихся имён - " + map.getSameFirstNameCount());
    }
}
