package filehandling.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static int x = 10;

    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Bike", "1234");
        Vehicle car = new Vehicle("Car", "3241");

        try(FileOutputStream fos = new FileOutputStream("/home/mandar-dhamale/vehicle.dat")){
            try(ObjectOutputStream obj = new ObjectOutputStream(fos)){
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("Object serialization completed.");
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}