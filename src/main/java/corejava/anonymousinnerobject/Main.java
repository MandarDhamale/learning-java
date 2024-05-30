package corejava.anonymousinnerobject;

public class Main {

    public static void main(String[] args) {

        Lock lock = new Lock() {
            @Override
            public String isUnlocked(String key) {
                if (key.equals("1234"))
                    return "Unlocked";
                else
                    return "Locked";
            }
        };

        System.out.println(lock.isUnlocked("123"));

    }

}

