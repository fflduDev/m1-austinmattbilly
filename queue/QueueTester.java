package queue;

public class QueueTester {
    public static void main(String[] args) {
        QueueImpl busQueue = new QueueImpl();

        // Enqueue 6 riders
        busQueue.enQueue("Alice");
        busQueue.enQueue("Bob");
        busQueue.enQueue("Charlie");
        busQueue.enQueue("David");
        busQueue.enQueue("Eve");
        busQueue.enQueue("Frank");

        // Display queue
        busQueue.display();

        // Peek at front of the queue
        System.out.println("Peek: " + busQueue.peek());

        // Dequeue and print remaining elements
        busQueue.deQueue();
        busQueue.display();

        // Add two more riders
        busQueue.enQueue("Grace");
        busQueue.enQueue("Hank");

        // Peek again
        System.out.println("Peek: " + busQueue.peek());

        // Remove the head & print queue
        busQueue.deQueue();
        busQueue.display();

        // Remove all elements
        while (!busQueue.isEmpty()) {
            busQueue.deQueue();
        }

        // Verify queue is empty
        System.out.println("Queue is empty? " + busQueue.isEmpty());
    }
}

