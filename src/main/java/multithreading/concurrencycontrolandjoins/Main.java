package multithreading.concurrencycontrolandjoins;

public class Main {

    public static int counter1 = 0;
    public static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter1++;
                }
                System.out.println("Execution completed of thread " + Thread.currentThread().getName());
            }
        });
        thread1.setName("thread1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        thread1.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    counter2++;
                }
                System.out.println("Execution completed of thread " + Thread.currentThread().getName());
            }
        });
        thread2.setName("thread2");
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread1.join();
                    thread2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Counter1: " + counter1);
                System.out.println("Counter2: " + counter2);
                System.out.println("Execution completed of thread " + Thread.currentThread().getName());
            }
        });
        thread3.setName("thread3");
        thread3.start();


        System.out.println("Execution completed of thread " + Thread.currentThread().getName());
    }
}