package corejava.throwkeyword;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        try {
            main.showMessage();
        } finally {
            System.out.println("Inside main() method");
        }

    }

    public void showMessage() {
        if (true) {
            throw new RuntimeException();
        }
        System.out.println("Inside showMessage() method");

    }


}
