package multithreading.blockingqueue;

import java.lang.reflect.Array;
import java.util.concurrent.ArrayBlockingQueue;

class Producer implements  Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
                queue.put(Main.counter);
                System.out.println(Main.counter + " added in queue");
                Main.counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements  Runnable{
    private ArrayBlockingQueue<Integer> queue;

    public Consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
                queue.take();
                System.out.println(Main.counter + " removed from queue");
                Main.counter--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Main {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread thread1 = new Thread(new Producer(queue));
        thread1.start();

        Thread thread2 = new Thread(new Consumer(queue));
        thread2.start();

//        ArrayBlockingQueue<Integer> queue2 = new ArrayBlockingQueue<>(10);
//        Thread thread2 = new Thread(new Producer(queue2));
//        thread2.start();

//  testing a runnable interface
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Test runnable interfrace");
//            }
//        });
//        thread2.start();

    }
}
