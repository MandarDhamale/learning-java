package collections.maps.searchinmaps;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

class Player implements Comparable<Player> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(kitNumber, player.kitNumber) && Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kitNumber, playerName);
    }
}


public class Main {
    public static void main(String[] args) {
        Map<Player, String> players = new TreeMap<>();
        players.put(new Player("18", "virat"), "king");
        players.put(new Player("45", "rohit"), "hitman");

        System.out.println(players);

        String playerKey = "king";
        Player pl = null;

        for (Player key : players.keySet()) {
            if (players.get(key).equals(playerKey)) {
                pl = key;
                break;
            }
        }
        System.out.println(pl);


    }
}
