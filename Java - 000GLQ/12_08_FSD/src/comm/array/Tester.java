package comm.array;


public class Tester {

	
	
    public static void main(String[] args) {

        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Size of stack after push operations: " + stack.size());

        System.out.printf("Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
            
        }
        System.out.println();
        System.out.println();
        System.out.println("Size of stack after pop operations : " + stack.size());
    }
}


