package comm.exceptions;

public class PersonEqualsException extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2714374364733695044L;
	private String message;
	public PersonEqualsException(String message) {
		super();
		this.message = message;
	}
	public PersonEqualsException() {
		super();
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
