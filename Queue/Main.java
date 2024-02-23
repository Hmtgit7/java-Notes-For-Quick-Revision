package Queue;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Queue<Integer> queue = new LinkedList<>();
         * queue.add(3);
         * queue.add(6);
         * queue.add(5);
         * queue.add(19);
         * queue.add(1);
         * 
         * System.out.println(queue.remove());
         * System.out.println(queue.remove());
         */

        /*
         * Deque<Integer> deque = new ArrayDeque<>();
         * deque.add(89);
         * deque.addLast(78);
         * deque.removeFirst();
         * // etc etc
         */

        CustomQueue queue = new CustomQueue(5);
        queue.insert(12);
        queue.insert(13);
        queue.insert(14);
        queue.insert(15);
        queue.insert(16);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
