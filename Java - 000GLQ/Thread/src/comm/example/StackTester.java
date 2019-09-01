package comm.example;

public class StackTester implements Runnable{

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		StackProducer myThread1 = new StackProducer(myStack);
		StackConsumer myThread2 = new StackConsumer(myStack);
		Thread t1=new Thread(myThread1);
		Thread t2=new Thread(myThread2);
		t1.start();
		t2.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
