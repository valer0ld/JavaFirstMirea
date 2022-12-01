package ru.mirea.task18;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception exception) {
            System.out.println("Enter an integer!( != 0)");

        }
        finally {
            System.out.println("In Finally");
        }
    }
}
