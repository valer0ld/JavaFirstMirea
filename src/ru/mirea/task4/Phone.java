package ru.mirea.task4;

import java.util.Scanner;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 1;
    }

    public Phone() {
        this.number = "+70000000000";
        this.model =  "basic";
        this.weight = 1;
    }

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number)
    {
        System.out.println("Звонит " + name + "(" + number + ")");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String ...number)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сообщение: ");
        scanner.nextLine();
        System.out.println("Вы отправили сообщение номерам: ");
        for (String x: number) System.out.println(x);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
