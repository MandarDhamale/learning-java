package corejava.throwskeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Main a = new Main();
        a.readFile();
    }

    public void readFile() throws FileNotFoundException {

        FileReader fr = new FileReader("text.txt");
        System.out.println("File read complete");

    }

}
