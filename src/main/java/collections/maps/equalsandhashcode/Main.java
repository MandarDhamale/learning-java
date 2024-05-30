package collections.maps.equalsandhashcode;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Objects;
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

        String s1 = "Mandar";
        s1 += "Dhamale";
        String s2 = "MandarDhamale";
        String s3 = new String("MandarDhamale");

        System.out.println(s1 + "->" + s1.hashCode());
        System.out.println(s2 + "->" + s2.hashCode());
        System.out.println(s3 + "->" + s3.hashCode());

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);

        Player virat = new Player("18", "virat");
        Player virat1 = new Player("18", "virat");

        System.out.println("virat->" + virat.hashCode());
        System.out.println("virat1->" + virat1.hashCode());

        System.out.println(virat == virat1);
        System.out.println(virat.equals(virat1));


    }

}



