import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Inserting (enqueuing) elements into the queue
        queue.offer(5);
        queue.offer(10);
        queue.offer(15);
        queue.offer(20);

        System.out.println("Queue elements after enqueuing:");
        System.out.println(queue);

        // Removing (dequeuing) elements from the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue elements after dequeuing:");
        System.out.println(queue);

        // Peek: Retrieve the front element without removing it
        int frontElement = queue.peek();
        System.out.println("Front element in the queue: " + frontElement);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
