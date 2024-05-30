package corejava.enumerator;

public class Main {
    public static void main(String[] args) {

        Players players = Players.GILL;

        switch (players){
            case GILL -> System.out.println("Shubman Gill");
            case RUTURAJ -> System.out.println("Ruturaj Gaikwad");
            case VIRAT -> System.out.println("Virat Kohli");
        }

        switch (Players.RUTURAJ){
            case GILL -> System.out.println("Shubman Gill");
            case RUTURAJ -> System.out.println("Ruturaj Gaikwad");
            case VIRAT -> System.out.println("Virat Kohli");
        }

        System.out.println(Players.DHONI);
        System.out.println(Players.DHONI.getName());
        Players.DHONI.setName("Mahi");
        System.out.println(Players.DHONI.getName());

    }
}
