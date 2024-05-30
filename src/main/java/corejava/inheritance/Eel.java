package corejava.inheritance;

public class Eel extends Fish{

    private String electricCharge;

    public String getElectricCharge() {
        return electricCharge;
    }

    public void setElectricCharge(String electricCharge) {
        this.electricCharge = electricCharge;
    }

    public String  showInfo(){
        return "Eel";
    }


}
