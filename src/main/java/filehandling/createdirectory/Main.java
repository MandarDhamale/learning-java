package filehandling.createdirectory;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        File file = new File("Folder");
//        if(file.mkdir()){
//            System.out.println("Folder created");
//        }else {
//            System.out.println("Folder not created");
//        }

        File file2 = new File("Folder/Sub Folder/ Sub Sub Folder");
        if(file2.mkdirs()){
            System.out.println("Folder created");
        }else {
            System.out.println("Folder not created");
        }

    }
}
