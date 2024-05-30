package corejava.strings;

public class Main {
    public static void main(String[] args) {
        String a = "Mandar";
        String b = "Dhamale";
        String c = a + b;
        System.out.println(c);

        if(a == "Mandar")
            System.out.println("True");
        else
            System.out.println("False");


        c = a.concat(b);
        System.out.println(c);

        if(a.equals("MandarDhamale"))
            System.out.println("True");
        else
            System.out.println("False");

    }
}
