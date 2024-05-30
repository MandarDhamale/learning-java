package corejava.finalkeywordmethodandclass;

public class Main {
    public static void main(String[] args) {

/**
 * Final keywords for methods and classes:
 * If we mark an method as final we cannot override it
 * If we mark an class as final we cannot inherit it
 **/

        Child c = new Child();
        c.India();
        c.USA();

        Parent p = new Parent();
        p.India();
        p.USA();

    }
}
