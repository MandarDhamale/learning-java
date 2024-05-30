package corejava.anonymousobject;

public class Main {

    public static void main(String[] args) {

        if (new Lock().getCode() == "1df234") System.out.println("Door is now opened");
        else System.out.println("Invalid code - door closed");

    }


}
