package ru.mirea.task13.ex5;

public class TestNumber {
    public static void main(String[] args) {
        String[] num = new String[4];
        num[0] = "+79646332033";
        num[1] = "89646332033";
        num[2] = "+1239646332033";
        num[3] = "1239646332033";
        for (String x: num) System.out.println("Изначальный вид: " + x + " Изменённый: " + new TelephoneNumber(x).changeFormat());
    }
}
