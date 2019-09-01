package comm.exceptions;
import java.io.Serializable;
public class Account implements Serializable{
	private String accountNumber;
	private double amount;
	
	public Account(String accountNumber2, double amount2) {
		// TODO Auto-generated constructor stub
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public String getAccountNumber() {
		return accountNumber;
		
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" +accountNumber +",Amount=" +amount + "]";
	}
	public Account createNewAccount(String accountNumber,double amount) throws AccountNotValidException {
		this.accountNumber=accountNumber;
		this.amount=amount;
		if(amount<10000) {
			throw new AccountNotValidException("Not a valid amount,account cant be created");
			
		}
		return new Account(accountNumber,amount);
	}

}
