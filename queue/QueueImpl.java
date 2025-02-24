package queue;

public class QueueImpl implements Queue {
    private static final int SIZE = 10; // Max size of queue
    private String[] queueArray;
    private int front, rear, count;

    public QueueImpl() {
        queueArray = new String[SIZE];
        front = 0;
        rear = -1;
        count = 0;
    }

    @Override
    public boolean isFull() {
        return count == SIZE;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void enQueue(String element) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue: " + element);
            return;
        }
        rear = (rear + 1) % SIZE; // Circular queue logic
        queueArray[rear] = element;
        count++;
        System.out.println("Enqueued: " + element);
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return null;
        }
        String removedElement = queueArray[front];
        front = (front + 1) % SIZE; // Move front pointer
        count--;
        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % SIZE;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return null;
        }
        return queueArray[front];
    }
}
