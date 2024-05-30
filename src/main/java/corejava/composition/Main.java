package corejava.composition;

public class Main {

    public static void main(String[] args){

        Processor p1 = new Processor();
        GraphicsCard g1 = new GraphicsCard("AMD", "Radeon 5000", "8GB");

        Laptop acer = new Laptop();
        System.out.println(acer);
        acer.setGraphicsCard(g1);
        acer.setProcessor(p1);
        System.out.println(acer);


    }


}
