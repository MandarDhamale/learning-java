package filehandling.readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/mandar-dhamale/Test.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("File read operation completed.");
        }
    }
}
