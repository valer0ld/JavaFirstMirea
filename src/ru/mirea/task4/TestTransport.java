package ru.mirea.task4;

public class TestTransport {
    public static void main(String[] args) {
        double distance = 1000;
        Car car = new Car(50, 9, 90);
        Plane plane = new Plane(17, 700, 800);
        Train train = new Train(17, 200, 110);
        Ship ship = new Ship(17, 700, 80);
        System.out.print("Car:\nCost: " + car.costForKg(distance) + " Time: " + car.travelTime(distance)
                + "\nPlane:\nCost: " + plane.costForKg(distance) + " Time: " + plane.travelTime(distance)
                + "\nTrain:\nCost: " + train.costForKg(distance) + " Time: " + train.travelTime(distance)
                + "\nShip:\nCost: " + ship.costForKg(distance) + " Time: " + ship.travelTime(distance));
    }
}
