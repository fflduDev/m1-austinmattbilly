package app;

import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

    public static void main(String[] args) {
        // create implementation, then

        System.out.println("-----L I S T  T E S T------");

        // listRunTestMethod...

        System.out.println("-----S T A C K  T E S T------");

        // StackRunTestMethod...

        System.out.println("----Q U E U E  T E S T-------");

        Queue busQueue = new QueueImpl();

        System.out.println("Adding riders to the queue...");
        busQueue.enQueue("John");
        busQueue.enQueue("Sara");
        busQueue.enQueue("Mike");
        busQueue.enQueue("Emma");
        busQueue.enQueue("Lucas");
        busQueue.enQueue("Olivia");

        System.out.println("Riders in queue:");
        busQueue.display();

        System.out.println("Next rider: " + busQueue.peek());

        System.out.println("Dequeuing a rider...");
        busQueue.deQueue();
        busQueue.display();

        System.out.println("Adding two more riders...");
        busQueue.enQueue("Ethan");
        busQueue.enQueue("Sophia");
        busQueue.display();

        System.out.println("Peeking at queue: " + busQueue.peek());

        System.out.println("Dequeuing and printing updated queue:");
        busQueue.deQueue();
        busQueue.display();

        System.out.println("Removing all riders...");
        while (!busQueue.isEmpty()) {
            busQueue.deQueue();
        }

        System.out.println("Queue is empty? " + busQueue.isEmpty());
    }
}
