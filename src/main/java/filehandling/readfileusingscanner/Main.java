package filehandling.readfileusingscanner;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/mandar-dhamale/Test.txt");
        try(Scanner sc = new Scanner(new FileReader(file))){
            String line;
            while (sc.hasNext()){
                line = sc.nextLine();
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("File read operation completed.");
        }
    }
}
