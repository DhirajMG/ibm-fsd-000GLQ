package comm.exceptions;

public class AccountNotValidException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3405659450024312464L;
	private String message;
	public AccountNotValidException() {
		super();
	}
	public AccountNotValidException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
