package Basics;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
	    public static void main(String[] args) {
	        // Creating a Queue using LinkedList
	        Queue<Integer> queue = new LinkedList<>();

	        // 1. Enqueue (Adding elements)
	        queue.offer(10);
	        queue.offer(20);
	        queue.offer(30);
	        System.out.println("Queue after enqueuing: " + queue);

	        // 2. Peek (Check front element without removing)
	        System.out.println("Front element (peek): " + queue.peek());

	        // 3. Dequeue (Removing elements)
	        System.out.println("Dequeued element: " + queue.poll());
	        System.out.println("Queue after dequeue: " + queue);

	        // 4. Check if queue is empty
	        System.out.println("Is queue empty? " + queue.isEmpty());

	        // 5. Get size of queue
	        System.out.println("Queue size: " + queue.size());
	    }
	}
