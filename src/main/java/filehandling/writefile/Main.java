package filehandling.writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/mandar-dhamale/Test.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
            bw.newLine();
            bw.write("Hello World! ");
            System.out.println("File operation successful...");

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Something went wrong :(");
        }
    }
}
