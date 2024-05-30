package collections.linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();
        players.add("Virat");
        players.add("Rohit");
        players.add("Gill");
        players.add(1, "KL Rahul");

        System.out.println(players);

        players.set(1, "Jaiswal");
        System.out.println(players);

    }
}
