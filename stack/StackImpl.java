package stack; 

public class StackImpl implements Stack {

	@Override
	public void push(String s) {
        if (isFull()) {
            System.out.println("full stack cant push: " + s);
            return;
        }
        stackArray[++top] = s;
        System.out.println("added to stack: " + s);
    }

	@Override
	public String pop() {
		// TODO Auto-generated method stub
        if (isEmpty()) {
            System.out.println("empy stack cant pop");
            return null;
        }
        return stackArray[top--];
    }
    
	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
        return top == -1;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
        return top == capacity - 1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
        return top + 1;
	}

	@Override
	public String peek() {
		// TODO Auto-generated method stub
        if (isEmpty()) {
            System.out.println("empty stack no top element");
            return null;
        }
        return stackArray[top];
    }
	@Override
	public void setCapacity(int size) {
		// TODO Auto-generated method stub
		public void setCapacity(int size) {
        this.capacity = size;
        stackArray = new String[capacity];
        top = -1;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
            System.out.println("empty stack");
            return;
        }
        System.out.print("stacks content: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
	}
 

}
