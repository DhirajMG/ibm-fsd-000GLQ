package comm.exceptions;
import java.io.Serializable;

public class Person implements Serializable{
	 private String fname;
	 private String lname;
	public Person() {
		super();
	}
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Person createName(String fname,String lname) throws PersonException {
		this.fname=fname;
		this.lname=lname;
		if(fname.charAt(0)<65 || fname.charAt(0)>91) {
			throw new PersonException("Not a valid name");	
		}
		else {
		return new Person(fname,lname);
	}

	}
}
