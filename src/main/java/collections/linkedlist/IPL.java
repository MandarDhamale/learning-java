package collections.linkedlist;

import java.util.ArrayList;

public class IPL {
    public static void main(String[] args) {

        ArrayList<String> mi = new ArrayList<>();

        mi.add("Rohit");
        mi.add("Hardik");
        mi.add("Bumrah");

        ArrayList<String> csk = new ArrayList<>();
        csk.add("Ruturaj");
        csk.add("Dhoni");
        csk.add("Jadeja");

        System.out.println("MI: ");
//        System.out.println(mi);
        IPL.printTeam(mi);

        System.out.println("CSK: ");
//        System.out.println(csk);
        IPL.printTeam(csk);


    }

    static void printTeam(ArrayList<String> team){
        for(String player: team){
            if(team.size() == team.indexOf(player) + 1)
                System.out.print(player);
            else
                System.out.print(player + ", ");
        }
        System.out.println();
    }

}
