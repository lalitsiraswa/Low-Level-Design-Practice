package java_collections_framework;

import java.util.*;

// FIFO QUEUE
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
        System.out.println("Is Queue Empty : " + queue.isEmpty());

//        FIFO STACK
//        Stack Practice
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        while (!stack.empty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

        System.out.println("-----");
//        Double Ended Queue
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        System.out.println(deque.peek());
    }
}
