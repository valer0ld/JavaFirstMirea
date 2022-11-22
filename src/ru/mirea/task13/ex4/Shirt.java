package ru.mirea.task13.ex4;

public class Shirt {
    private final String number;
    private final String model;
    private final String color;
    private final String size;

    /*
    public Shirt(String number, String model, String color, String size) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.size = size;
    }
*/

    public Shirt(String info) {
        String[] infoAr = info.split(",");
        this.number = infoAr[0];
        this.model = infoAr[1];
        this.color = infoAr[2];
        this.size = infoAr[3];
    }

    @Override
    public String toString() {
        return "Shirt{ " + number + ", " + model + ", " + color + ", " + size + '}';
    }
}
