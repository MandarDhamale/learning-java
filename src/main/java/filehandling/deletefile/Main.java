package filehandling.deletefile;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/home/mandar-dhamale/Test.txt");
        if(file.delete()){
            System.out.println(file.getName() + " has been deleted.");
        }else{
            System.out.println("There was some error while deleting the file " + file.getName());
        }
    }
}