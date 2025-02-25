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
	public ListItem head;
	
	public LinkedListImpl() {
		this.head = null;
		this.size = 0;
	}
	

	@Override
	public Boolean isItemInList(String thisItem) {
		// TODO Auto-generated method stub
		 ListItem curr = head;
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
		
		ListItem n = new ListItem(thisItem);
		System.out.println("hello from addItem in LinkedListImpl - the item passed in: " + thisItem);
		
		if (head ==null) {
			head = n;
			return true;} else {
				ListItem current = head;
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
		ListItem current = head;
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
		ListItem current = head;
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
		// TODO Auto-generated method stub 
		ListItem item = new ListItem(newItem);
		
		if (head == null) {
			System.out.println("The list is empty, no item to insert before.");
		}
		if (head.data.equals(itemToInsertBefore)) {
			item.next = head;
			head = item;
			size++;
			return true;
			
			
			
		}
		ListItem curr = head;
		while ( curr.next != null && !curr.next.data.equals(itemToInsertBefore)) {
			curr = curr.next;
		}
		
		if (curr.next != null) {
			item.next = curr.next;
			curr.next = item;
			size++;
			return true;
		}
		else {
			System.out.println(itemToInsertBefore + "not found");
			return false;
		}
		
		
		
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
		// TODO Auto-generated method stub
		
		if (head == null) {
			System.out.println("The list is empty, no item to insert after.");
			return false;
		}
		ListItem curr = head;
		while(head!= null && !curr.data.equals(itemToInsertAfter)) {
			head = curr.next;
			
		}
		if (curr != null) {
			ListItem item = new ListItem(newItem);
			curr.next = item;
			size++;
			return true;
			
		} else {
			System.out.println(itemToInsertAfter + "was not found");
			return false;
		}
			
		
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		if (head == null || head.next == null) {
	        return; // List is empty or has only one item, no sorting needed.
	    }

	    boolean swapped;
	    do {
	        swapped = false;
	        ListItem curr = head;
	        ListItem prev = null;

	        while (curr != null && curr.next != null) {
	            if (curr.data.compareTo(curr.next.data) > 0) {
	                // Swap values
	                String temp = curr.data;
	                curr.data = curr.next.data;
	                curr.next.data = temp;
	                swapped = true;
	            }
	            prev = curr;
	            curr = curr.next;
	        }
	    } while (swapped); 

		
	}
	
	
}
