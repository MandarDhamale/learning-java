package corejava.localinnerclass;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();
        if(door.lockStatus(args[1]))
            System.out.println("Door is locked");
        else
            System.out.println("Door is unlocked");
    }




}
