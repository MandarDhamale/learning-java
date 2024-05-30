package corejava.inheritance;

public class Reptile extends Animal{

    private String drySkin;
    private String backbone;

    public String getDrySkin() {
        return drySkin;
    }

    public void setDrySkin(String drySkin) {
        this.drySkin = drySkin;
    }

    public String getBackbone() {
        return backbone;
    }

    public void setBackbone(String backbone) {
        this.backbone = backbone;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "drySkin='" + drySkin + '\'' +
                ", backbone='" + backbone + '\'' +
                '}' + super.toString();
    }
}
