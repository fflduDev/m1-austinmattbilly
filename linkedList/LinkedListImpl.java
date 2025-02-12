package linkedList;
class Node {
	String data;
	Node next;
	
	Node(String data) {                  //node class
		this.data = data;
		this.next = next;
	}
}
public class LinkedListImpl implements LinkedList {
	
	Node head;
	LinkedListImpl() {
		this.head = null;
	}
	

	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addItem(String thisItem) {
		
		Node n = new Node(thisItem);
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
		
	
		
		return null;
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listItems() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}
	
}
