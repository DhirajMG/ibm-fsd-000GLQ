package comm.example;

public class Calculator {
	private int x;
	private int y;
	
	public Calculator() {
		super();
	}
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public boolean greaterMethod() {
		if(this.x>this.y)
			return true;
		else
			return false;
	}

}
