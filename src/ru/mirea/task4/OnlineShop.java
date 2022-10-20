package ru.mirea.task4;

import java.util.Arrays;
import java.util.Scanner;


public class OnlineShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        scanner.next();
        System.out.print("Введите пароль: ");
        scanner.next();
        String[] korzina = new String[20];
        int i, menu = 1;
        int pokupka = 0;
        int current = 0;
        double sum = 0.0;
        while (menu != 0)
        {
            i = 1;
            for (Catalog x: Catalog.values()) {
                System.out.println(i + ". " + x);
                i++;
            }
            i = 1;
            System.out.print("Выберете каталог(0 - закончить покупки): ");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    for (Kurtki x : Kurtki.values()) {
                        System.out.println(i + ". " + x + " " + x.getCost());
                        i++;
                    }
                    System.out.print("Купить куртку под номером(0 - отказаться): ");
                    pokupka = scanner.nextInt();
                    switch (pokupka) {
                        case 1 -> {
                            korzina[current] = Kurtki.БелаяКуртка.toString();
                            sum += Kurtki.БелаяКуртка.getCost();
                        }
                        case 2 -> {
                            korzina[current] = Kurtki.ЖелтаяКуртка.toString();
                            sum += Kurtki.ЖелтаяКуртка.getCost();
                        }
                        case 3 -> {
                            korzina[current] = Kurtki.КраснаяКуртка.toString();
                            sum += Kurtki.КраснаяКуртка.getCost();
                        }
                    }
                    if (pokupka > 0 && pokupka <= 3) current++;
                }
                case 2 -> {
                    for (Bruki x : Bruki.values()) {
                        System.out.println(i + ". " + x + " " + x.getCost());
                        i++;
                    }
                    System.out.print("Купить брюки под номером(0 - отказаться): ");
                    pokupka = scanner.nextInt();
                    switch (pokupka) {
                        case 1 -> {
                            korzina[current] = Bruki.СиниеБрюки.toString();
                            sum += Bruki.СиниеБрюки.getCost();
                        }
                        case 2 -> {
                            korzina[current] = Bruki.ЧёрныеБрюки.toString();
                            sum += Bruki.ЧёрныеБрюки.getCost();
                        }
                        case 3 -> {
                            korzina[current] = Bruki.УзкиеБрюки.toString();
                            sum += Bruki.УзкиеБрюки.getCost();
                        }
                    }
                    if (pokupka > 0 && pokupka <= 3) current++;
                }
                case 3 -> {
                    for (Futbolki x : Futbolki.values()) {
                        System.out.println(i + ". " + x + " " + x.getCost());
                        i++;
                    }
                    System.out.print("Купить футболку под номером(0 - отказаться): ");
                    pokupka = scanner.nextInt();
                    switch (pokupka) {
                        case 1 -> {
                            korzina[current] = Futbolki.ЖелтаяФутболка.toString();
                            sum += Futbolki.ЖелтаяФутболка.getCost();
                        }
                        case 2 -> {
                            korzina[current] = Futbolki.КраснаяФутболка.toString();
                            sum += Futbolki.КраснаяФутболка.getCost();
                        }
                        case 3 -> {
                            korzina[current] = Futbolki.ФиолетоваяФутболка.toString();
                            sum += Futbolki.ФиолетоваяФутболка.getCost();
                        }
                    }
                    if (pokupka > 0 && pokupka <= 3) current++;
                }
            }
        }
        System.out.println("Ваша корзина: ");
        for(int y = 0; y < current; y++) System.out.println(korzina[y]);
        System.out.println("Общая сумма: " + sum + "\nВыполнить покупку?(1 - да, 0 - нет)");
        int t = scanner.nextInt();
        if (t == 0) System.out.println("Покупка не выполнена!");
        else if(t == 1) System.out.println("Покупка выполнена!");
    }
}
