package ru.mirea.task6;

public class TestPrinted {
    public static void main(String[] args) {
        Printable book1 = new Book("book1");
        Printable book2 = new Book("book2");
        Shop shop1 = new Shop("shop1");
        Shop shop2 = new Shop("shop2");
        Printable[] printable = {book1, shop1, book2, shop2};
        for(Printable x: printable) x.print();
    }
}
