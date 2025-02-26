package stack;

public class StackTester {

	public static void main(String[] args) {
        Stack stackTester = new StackImpl(5);
		stackTester.push("thing in stack");
        stackTester.push("another thing in stack");
        stackTester.display();
        System.out.println("popped: " + stackTester.pop());
        System.out.println("size: " + stackTester.size());
        runTests(new StackImpl(5));
	}
	
	public static void runTests(Stack stack) {
	    stack.setCapacity(5);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.display();
        System.out.println("peek: " + stack.peek());
        System.out.println("pop: " + stack.pop());
        stack.display();

	}

}
