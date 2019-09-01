package comm.example;

public class Electronics extends Product {
	private int year;

	public Electronics() {
		super();
	}

	public Electronics(int year) {
		super();
		this.year = year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	public int getName() {
		return year;
	}

}
