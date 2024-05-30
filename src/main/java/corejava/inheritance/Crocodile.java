package corejava.inheritance;

public class Crocodile extends Reptile{

    private String hardShellEggs;

    public String getHardShellEggs() {
        return hardShellEggs;
    }

    public void setHardShellEggs(String hardShellEggs) {
        this.hardShellEggs = hardShellEggs;
    }

    public String showInfo(){
        return "Crocodile";
    }

    @Override
    public String toString() {
        return "Crocodile{" +
                "hardShellEggs='" + hardShellEggs + '\'' +
                '}' + super.toString();
    }
}
