package corejava.polymorphism;

public class Main {

    public static void main(String[] args){

        Phone phone = new Phone();
        phone.feature();

        Nokia3310 nokia = new Nokia3310();
        nokia.feature();

        Iphone iphone = new Iphone();
        iphone.feature();

        Phone phone1 = new Nokia3310();
        phone1.feature();

        phone1 = new Iphone();
        phone1.feature();


    }

}
