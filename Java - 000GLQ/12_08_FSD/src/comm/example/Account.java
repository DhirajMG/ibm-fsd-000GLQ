package comm.example;

public class Account {
	private int number;
	private String holder;
	public Account() {
		
	}
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setHolder(String holder) {
		this.holder=holder;
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Account ac= (Account)obj;
		if(ac.holder==this.holder && ac.number==this.number)
			return true;
		else
			return false;		
		}
	@Override
	public String toString() {
		
		return "Account Det: \n Name:"+holder+"\nId:"+number;
	}
	

}
