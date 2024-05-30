package corejava.interfaces;

public class Main {

    public static void main(String[] args) {
        Samsung s23 = new Samsung();
        System.out.println(s23.processor());
        System.out.println(s23.storage());
        System.out.println(s23.okGoogle());

        System.out.println();

        Iphone iphone = new Iphone();
        System.out.println(iphone.processor());
        System.out.println(iphone.storage());
        System.out.println(iphone.heySiri());




    }

}
