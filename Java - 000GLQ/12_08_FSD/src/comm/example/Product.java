package comm.example;

public class Product {
private int rate;
private static int count;


public Product() {
	super();
	count+=1;
}
static {
	count = 0;
}

public Product(int rate) {
	super();
	this.rate = rate;
}

public void setRate(int rate) {
	this.rate=rate;
}
public int getRate() {
	return rate;
}
public int get_count() {
	return count;
}
}
