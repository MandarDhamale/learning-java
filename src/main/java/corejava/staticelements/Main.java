package corejava.staticelements;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car1: " + car.getDoors());
        car.setDoors(2);
        System.out.println("Car1: " + car.getDoors());

        Car car1 = new Car();
        System.out.println("Car2: " + car1.getDoors());


    }
}
