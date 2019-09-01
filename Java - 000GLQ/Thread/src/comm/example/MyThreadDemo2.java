package comm.example;

public class MyThreadDemo2 implements Runnable{

	public static void main(String[] args) {
		
		
	}
	@Override
	public void run() {
		try{
			for(int j=0;j<10;j++)
		
		{
			System.out.println("==>:" +j);
			if(j==10) {
				Thread.sleep(2000);
			}
		}
	}catch (Exception e) {

	}
}
}
