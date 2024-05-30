package corejava.interfaces;

public class Iphone implements Phone, IOS {
    @Override
    public String processor() {
        return "A15 Bionic";
    }

    @Override
    public String storage() {
        return "256GB";
    }


    @Override
    public String heySiri() {
        return "Siri: How can I help you?";
    }
}
