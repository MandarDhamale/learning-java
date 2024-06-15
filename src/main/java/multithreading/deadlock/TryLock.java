package multithreading.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLock {


    static Lock lock1 = new ReentrantLock();
    static Lock lock2 = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                lock1.lock();
                System.out.println("Thread 1: Holding lock 1...");
                lock2.lock();
                System.out.println("Thread 1: Holding lock 1 & 2...");
                lock2.unlock();
                lock1.unlock();

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                lock2.lock();
                System.out.println("Thread 2: Holding lock 2...");
                lock1.lock();
                System.out.println("Thread 2: Holding lock 1 & 2...");
                lock1.unlock();
                lock2.unlock();

            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Main thread");

    }


}