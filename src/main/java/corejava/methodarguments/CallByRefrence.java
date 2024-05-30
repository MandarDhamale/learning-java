package corejava.methodarguments;

public class CallByRefrence {
    public static void main(String[] args) {
        String[] players = {"Rohit", "Kohli", "Dholi"};
        System.out.println(players[0]);
        CallByRefrence cbr = new CallByRefrence();
        System.out.println(players[0]);
    }

    void displayPlayers(String[] players){
        System.out.println(players);
        players[0] = "Gill";
    }

}
