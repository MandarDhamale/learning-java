package corejava.inheritance;

public class Fish extends Animal {

    private String livesInWater;
    private String hasGills;


    @Override
    public String toString() {
        return "Fish{" +
                "livesInWater='" + livesInWater + '\'' +
                ", hasGills='" + hasGills + '\'' +
                '}';
    }
}
