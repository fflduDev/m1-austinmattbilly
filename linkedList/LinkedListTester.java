package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		// create implementation, then...
		
		LinkedList tester = new LinkedListImpl();
		tester.addItem("apple");
		tester.addItem("orange");
		tester.addItem("grape");
		tester.addItem("banana");
		tester.addItem("mango");
		
		System.out.println("here is your list before sorting");
		tester.listItems();
		
		tester.sort();
		System.out.println("your list after sorting");
		tester.listItems();
		
		System.out.println("testing add and remove functions");



		

	}

}
