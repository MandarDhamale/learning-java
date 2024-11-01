package filehandling.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("/home/mandar-dhamale/vehicle.dat")){
            try(ObjectInputStream obj = new ObjectInputStream(fis)){
                Vehicle o1 = (Vehicle) obj.readObject();
                Vehicle o2 = (Vehicle) obj.readObject();
                System.out.println(o1);
                System.out.println(o2);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
