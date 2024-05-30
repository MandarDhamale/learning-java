package multithreading.synchronizationunderconcurrencycontrol;

public class Main {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    Main.counter++;
                }
                System.out.println("The loop in thread1 is over!");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100000; i++) {
                    Main.counter++;
                }
                System.out.println("The loop in thread2 is over!");


            }
        }).start();

        Thread.sleep(1000);
        System.out.println(Main.counter);


    }
}
