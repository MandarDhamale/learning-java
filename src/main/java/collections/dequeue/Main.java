package collections.dequeue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        Deque deque = new LinkedBlockingDeque();

        System.out.println(deque.poll());

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);

        deque.addFirst(9);
        deque.addLast(9);

        System.out.println(deque);

    }
}
