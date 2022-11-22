package ru.mirea.task13.ex2;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Petsinyarzh", "", "");
        Person p2 = new Person("Petsinyarzh", "Valera", "Romanovich");
        Person p3 = new Person("Petsinyarzh", "Valera", "");
        System.out.println("1: " + p1.FIO() + " 2: " + p2.FIO() + " 3: " + p3.FIO());
    }
}
