package ru.mirea.task4;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123", "aaa", 10);
        Phone phone2 = new Phone("456", "bbb", 12);
        Phone phone3 = new Phone("789", "ccc", 10);
        System.out.println("phone1: " + phone1 + "\nphone2: " + phone2 + "\nphone3: " + phone3);
        System.out.println("Номера телефонов: " + phone1.getNumber() +  ", " + phone2.getNumber() + ", " + phone3.getNumber());
        phone1.receiveCall("Valera", "432");
        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
    }
}
