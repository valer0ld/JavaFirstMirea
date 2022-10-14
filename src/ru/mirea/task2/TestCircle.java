package ru.mirea.task2;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, 1.0, 2.0);
        Circle c2 = new Circle(2.0, 1.5, 3.0);
        System.out.println("Данные круга с1: r = "  + c1.getR() + ", x = " + c1.getX() + ", y = " + c1.getY());
        System.out.println("Измерим площадь с длиннной окружности");
        System.out.println("c1: \nПлощадь: " + c1.square() + "\nДлинна окржуности: " + c1.circleLength());
        System.out.println("c1: " + c1.toString() + "\nc2: " + c2.toString() + "\nОни равны: " + c1.compare(c2));
        System.out.println("Изменим данные с1 на r = 2, x = 5, y = 0 и ");
        c1.setR(2.0);
        c1.setX(5.0);
        c1.setY(0);
        System.out.println("c1: " + c1.toString() + "\nc2: " + c2.toString() + "\nОни равны: " + c1.compare(c2));
    }
}
