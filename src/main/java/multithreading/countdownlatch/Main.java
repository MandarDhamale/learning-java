package multithreading.countdownlatch;

import java.util.concurrent.CountDownLatch;

class SomeThread extends Thread {

    private CountDownLatch latch;

    public SomeThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " thread started");
        System.out.println(Thread.currentThread().getName() + " thread ended");
        System.out.println("*****");
        latch.countDown();
    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " thread started");

        CountDownLatch latch = new CountDownLatch(5);
        SomeThread thread1 = new SomeThread(latch);
        SomeThread thread2 = new SomeThread(latch);
        SomeThread thread3 = new SomeThread(latch);
        SomeThread thread4 = new SomeThread(latch);
        SomeThread thread5 = new SomeThread(latch);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        latch.await();

        System.out.println(Thread.currentThread().getName() + " thread ended");
    }
}
