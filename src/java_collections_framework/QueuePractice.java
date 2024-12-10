package java_collections_framework;

import java.util.LinkedList;
import java.util.Queue;

// FIFO
public class QueuePractice {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(4);
        queue.offer(6);
        queue.offer(8);
        System.out.println("Queue top element : " + queue.peek());
        System.out.println("Remove top element : " + queue.poll());
        System.out.println("Queue top element : " + queue.peek());
        System.out.println("Remove top element : " + queue.poll());
        System.out.println("Queue top element : " + queue.peek());
    }
}
