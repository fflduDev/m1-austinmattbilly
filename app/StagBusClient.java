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
        LinkedList stations = new LinkedListImpl();
        stations.addItem("Main Street");
        stations.addItem("Airport Terminal");
        stations.addItem("Down Town");
        stations.addItem("Town Square");
        
        stations.listItems();
        
        System.out.println("Checking if South Main is in list" + stations.isItemInList("South Main"));
        
        stations.deleteItem("Down Town");
        
        stations.listItems();
        stations.insertBefore("Post Road", "Airport Terminal");
        stations.listItems();
        stations.insertAfter("City Hall", "Post Road" );
        
        stations.listItems();


        
        
        



        System.out.println("-----S T A C K  T E S T------");
        Stack busStack = new StackImpl();
        System.out.println("pushing riders to stack");
        busStack.push("john");
        busStack.push("bob");
        busStack.push("charles");
        busStack.push("wayne");
        busStack.push("zion");
        busStack.push("lonzo");
        
        System.out.println("stack display");
        busStack.display();
        System.out.println("peeking stack " + busStack.peek());
        System.out.println("popping stack");
        busStack.pop();
        busStack.display();
        
        System.out.println("adding extra passengers");
        busStack.push("dwade");
        busStack.push("bron");
        busStack.display();
        System.out.println("peeking stack " + busStack.peek());
        System.out.println("removing all passengers");
        
        while (!busStack.isEmpty()) {
            busStack.pop();
        }
        System.out.println("stack status:  " + busStack.isEmpty());




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
