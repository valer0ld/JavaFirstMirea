package ru.mirea.task13.ex5;

public class TelephoneNumber {
    private final String number;

    public TelephoneNumber(String number) {
        this.number = number;
    }

    public String changeFormat()
    {
        StringBuilder revNum = new StringBuilder(this.number).reverse();
        return new StringBuilder().append(revNum.substring(0, 4)).append('-').append(revNum.substring(4, 7)).append('-').append(
                ')').append(revNum.substring(7, 10)).append('(').append(revNum.substring(10)).reverse().toString();
    }
}
