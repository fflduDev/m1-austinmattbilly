package linkedList;

//import template.ListNode;

class Node {
	String data;
	Node next;
	
	Node(String data) {                  //node class
		this.data = data;
		this.next = null;
	}
}
public class LinkedListImpl implements LinkedList {
	private int size;
	private Node head;
	
	LinkedListImpl() {
		this.head = null;
		this.size = 0;
	}
	

	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		 Node curr = head;
	        while (curr != null) {
	            if (curr.data.equals(thisItem)) {
	                return true;  // Item found
	            }
	            curr = curr.next;
	        }
	        return false;  // Item not found
	    }
	

	@Override
	public Boolean addItem(String thisItem) {
		
		Node n = new Node(thisItem);
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
		
		if (head ==null) {
			head = n;
			return true;} else {
				Node current = head;
				while (current.next!=null) {
					current = current.next;
				}
				current.next= n;
			}
		size++;
		return true;
		
	}

	@Override
	public Integer itemCount() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void listItems() {
		// TODO Auto-generated method stub
		Node current = head;
		while (current!= null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		
		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
		// TODO Auto-generated method stub
		if (head == null) {
			System.out.println("There are no items to delete");
			return false;
		}
		if (head.data.equals(thisItem)) {
			head = head.next;
			System.out.println(thisItem + "has been deleted from the list");
			return true;
		}
		Node current = head;
		while (current.next != null && current.next.data != thisItem) {
			current = current.next;
		}
		if (current.next!= null) {
			current.next=current.next.next;
			System.out.println(thisItem + "has been deleted from the list");
			return true;
		}
		System.out.println(thisItem + "was not found in your linkedList");
		return false;
	}

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
		// TODO Auto-generated method stub              //gonna figure this out later
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
