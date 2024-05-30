package collections.queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedBlockingQueue<>(5);

        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(10);
        }catch (Exception e){
            System.out.println("Something went wrong :(");
        }
        System.out.println(queue);


    }
}
