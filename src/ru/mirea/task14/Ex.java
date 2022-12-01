package ru.mirea.task14;

import java.util.regex.Pattern;


public class Ex {
    public static void main(String[] args) {
        System.out.println("Задание 2:\n");
        Pattern ex2 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        System.out.println("Регулярное выражение совпало с верным примером: - " + ex2.matcher("abcdefghijklmnopqrstuv18340").matches());
        System.out.println("Регулярное выражение совпало с неправильным примером: - " + ex2.matcher("abcdefghijklmnoasdfasdpqrstuv18340").matches());
        System.out.println("\nЗадание 3:\n");
        Pattern ex3 = Pattern.compile("(\\d+[.]?\\d*) ((USD)|(RUB)|(EU))");
        System.out.println("Регулярное выражение совпало с верным примером: - " + ex3.matcher("25.98 USD, 0.004 EU").find());
        System.out.println("Регулярное выражение совпало с неправильным примером: - " + ex3.matcher("44 ERR").find());
        System.out.println("\nЗадание 5:\n");
        Pattern ex5 = Pattern.compile("((((0[1-9]|[12][0-9]|30)/((0[1-9&&[^2]])|1[012]))" +
                "|(31/(0[13578]|1[02])))/((19|[2-9][0-9])[0-9][0-9]))" +
                "|((0[1-9]|1[0-9]|2[0-8])/(02)/((19|[2-9][0-9])[0-9][0-9]))" +
                "|(29/02/((19|[2-9][0-9])([02468][048]|[13579][26])))");
        System.out.println("Регулярное выражение совпало с верным примером: - " + ex5.matcher("29/02/2000,  30/04/2003, 01/01/2003").find());
        System.out.println("Регулярное выражение совпало с неправильным примером: - " + ex5.matcher("29/02/2001,  30-04-2003, 1/1/1899").find());
        System.out.println("\nЗадание 7:\n");
        Pattern ex7 = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?!.*[^_[A-Z][a-z][0-9]]).{8,}$");
        System.out.println("Регулярное выражение совпало с верным примером: - " + ex7.matcher("F032_Password").matches());
        System.out.println("Регулярное выражение совпало с неправильным примером: - " + ex7.matcher("smart_pass").matches());
    }
}
