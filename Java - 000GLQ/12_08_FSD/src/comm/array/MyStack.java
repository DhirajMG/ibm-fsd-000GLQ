package comm.array;
//import java.util.EmptyStackException;
//import java.util.EmptyStackException;
public class MyStack {

	    private int arr[];
	    private int size;
	    private int index = 0;

	    public MyStack(int size) {
	        this.size = size;
	        arr = new int[size];
	    }

	    public void push(int c) {

	        if (isFull()) {
	            System.out.println("Stack is full");
	        }

	        arr[index] = c;
	        index++;
	    }

	    public int pop() {

	    	
	    	
	        if (isEmpty()) {
	        	System.out.println("Stack is empty");
	        	
	        }
	        return arr[--index];
	    }

	    public boolean isEmpty() {
	        if (index == 0) {
	            return true;
	        }
	        return false;
	    }

	    public boolean isFull() {
	        if (index == size) {
	            return true;
	        }
	        return false;
	    }

	    public int size() {
	        return index;
	    }
	}




