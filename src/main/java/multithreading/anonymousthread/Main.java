package multithreading.anonymousthread;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Main {

    public static int threadCount1 = 1;
    public static int threadCount2 = 2;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    try {
                        sleep(new Random().nextInt(1000));
//                sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread No.: " + threadCount1 + " Iteration No.: " + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    try {
                        sleep(new Random().nextInt(1000));
//                sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread No.: " + threadCount2 + " Iteration No.: " + i);
                }
            }
        });

        thread1.start();
        thread2.start();

    }
}