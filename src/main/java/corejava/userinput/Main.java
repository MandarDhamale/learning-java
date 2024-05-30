package corejava.userinput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
        String name = scanner.next();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + " you are " + age + " years old.");
        scanner.close();
    }


}
