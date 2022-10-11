package ru.mirea.task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author test1 = new Author("Alise", "a@mail.ru", 'f');
        System.out.println("Можно вывести класс так: name - " + test1.getName() +
                ", email - " + test1.getEmail() + ", gender - " + test1.getGender());
        System.out.println("Изменю почту на a2@mail.ru с помощью сеттера.");
        test1.setEmail("a2@mail.ru");
        System.out.println("А можно вывести так: " + test1);
    }
}
