package comm.example.model;
import java.io.Serializable;
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -682890796996904762L;
	private int id;
	private String FirstName;
	private String LastName;
	private String email;
	public Employee() {
		super();
	}
	public Employee(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.FirstName = firstname;
		this.LastName = lastname;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstname) {
		this.FirstName = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastname) {
		this.LastName = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
