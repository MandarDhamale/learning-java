package corejava.interfaces;

public class Samsung implements Phone, Android {

    @Override
    public String processor() {
        return "Snapdragon 8 Gen1";
    }
    @Override
    public String storage() {
        return "128GB";
    }

    @Override
    public String okGoogle() {
        return "Google: How can I help you?";
    }
}
