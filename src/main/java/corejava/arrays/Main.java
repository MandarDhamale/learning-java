package corejava.arrays;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Mandar", "Makarand"};
        System.out.println(names[0] + ", " +  names[1]);

        String[] players;

        int[] values;
        values = new int[10];
        System.out.println(values);
        System.out.println(values[0]);


        for(String name: names){
            System.out.println(name);
        }




    }
}
