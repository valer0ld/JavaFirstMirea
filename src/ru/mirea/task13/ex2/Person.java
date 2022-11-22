package ru.mirea.task13.ex2;

public class Person {
    private final String surname;
    private final String name;
    private final String middleName;

    public Person(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
    }

    public String FIO()
    {
     StringBuilder fio = new StringBuilder().append(surname);
     if (!name.isEmpty())
     {
         fio.append(" ").append((name.charAt(0))).append('.');
         if (!middleName.isEmpty()) fio.append(middleName.charAt(0)).append('.');
     }
     return fio.toString();
    }
}
