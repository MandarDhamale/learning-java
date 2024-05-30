package corejava.enumerator;

public enum Players {
    VIRAT("King"), GILL("Prince"), JAISWAL("Jaiswal"), RUTURAJ("Rocket"), DHONI("Thala"), ROHIT("Hitman");

    private String name;
    Players(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
