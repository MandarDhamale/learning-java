package generics.wildcards;

import java.util.LinkedList;
import java.util.List;

class Vehicle{
    private int id;

    public Vehicle(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                '}';
    }
}

class Car extends Vehicle{
    private String model;

    public Car(int id, String model) {
        super(id);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}' + super.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new LinkedList<>();
        vehicleList.add(new Vehicle(1));
        vehicleList.add(new Vehicle(2));
        vehicleList.add(new Vehicle(3));
        vehicleList.add(new Vehicle(4));
        vehicleList.add(new Car(5, "7-Series"));

        System.out.println(vehicleList);
        System.out.println();
        Main.display1(vehicleList);
        System.out.println();
        Main.display2(vehicleList);

    }

    // outer bound
    public static void display1(List<? super Vehicle> list){
        for (Object o: list){
            System.out.println(o);
        }
    }

    // inner bound
    public static void display2(List<? extends Vehicle> list){
        for(Vehicle v: list){
            System.out.println(v);
        }
    }
}
