package corejava.methodarguments;

public class CallByValue {
    public static void main(String[] args) {

        int value = 10;
        CallByValue main = new CallByValue();
        main.displayValue(value);
        System.out.println("Value in main(): " + value);

    }

    void displayValue(int value){
        System.out.println("Value in displayValue(): " + value);
        value = 20;
        System.out.println("Value in displayValue(): " + value);
    }

}
