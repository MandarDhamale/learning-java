package corejava.polymorphism.nonstaticinnerclass;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.shopStatus();
        shop.lock.setLocking(false);
        shop.shopStatus();
    }

}

