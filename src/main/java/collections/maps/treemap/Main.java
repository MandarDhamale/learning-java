package collections.maps.treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Player implements Comparable<Player>{
    private String kitNumber;
    private String playerName;

    public Player(String kitNumber, String playerName) {
        this.kitNumber = kitNumber;
        this.playerName = playerName;
    }

    public String getKitNumber() {
        return kitNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "kitNumber='" + kitNumber + '\'' +
                ", playerName='" + playerName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Player player) {
        String code1 = kitNumber.concat(playerName);
        String code2 = player.getKitNumber().concat(player.getPlayerName());
        return code1.compareTo(code2);
    }
}




public class Main {
    public static void main(String[] args) {


        Map<Player, String> players = new TreeMap<>();
        players.put(new Player("18", "virat"), "king");
        players.put(new Player("45", "rohit"), "hitman");
        players.put(new Player("7", "dhoni"), "thala");
        System.out.println(players);

    }
}
