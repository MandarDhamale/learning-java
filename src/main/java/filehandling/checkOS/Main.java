package filehandling.checkOS;

public class Main {
    public static void main(String[] args) {

        String OS = System.getProperty("os.name").toLowerCase();
        System.out.println(OS);

    }
}
