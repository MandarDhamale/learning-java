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
                Thread.sleep(1000);
                queue.put(Main.counter);
                System.out.println(Main.counter + " added in queue");
                Main.counter++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static int counter = 0;

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread thread1 = new Thread(new Producer(queue));
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Test runnable interfrace");
            }
        });
        thread2.start();

    }
}
