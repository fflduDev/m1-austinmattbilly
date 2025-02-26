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
		
		System.out.println("testing insert and remove functions");
		
		tester.insertAfter("strawberry","grape");
		
		tester.deleteItem("mango");
		
		tester.listItems();
		
		System.out.println("just deleted mango, is it still in the list? " + tester.isItemInList("mango"));
		
		System.out.println("Now testing insertBefore:");
		tester.insertBefore("dragonfruit ", "strawberry");
		tester.sort();
		tester.listItems();
		System.out.println("items in the list: " + tester.itemCount());


		

	}

}
