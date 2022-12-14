package ru.mirea.task21.ex23;

public class Test {
    public static void main(String[] args) {
        allTypeList list = new allTypeList();
        int k = 10;
        String u = "abc";
        double i = 12.2;
        list.add(k);
        list.add(u);
        list.add(i);
        for(int y = 0; y < list.getSize(); y++)
        {
            System.out.println("list[" + y + "] = " + list.get(y));
        }

    }
}
