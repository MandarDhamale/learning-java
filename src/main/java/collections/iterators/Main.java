package collections.iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> players = new ArrayList<String>();
        players.add("Virat");
        players.add("Dhoni");
        players.add("Rohit");

        players.sort(null);
        Main.showPlayers(players);
        Collections.reverse(players);
        System.out.println();
        Main.showPlayers(players);


    }

    static void showPlayers(List<String> players) {

        Iterator<String> player = players.listIterator();
        while (player.hasNext()) {
            System.out.println(player.next());
        }

    }

    static void showPlayers_foreach(List<String> players) {
        for (String player : players) {
            System.out.println(player);
        }
    }


}
