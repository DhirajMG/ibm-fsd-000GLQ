package comm.example;

public class Employee {
	protected int id;
	protected String fname;
	protected String lname;
	protected String dept;
	public Employee(){

}
	public Employee(int id,String fname,String lname,String dept) {
		this.id=id;
		this.fname=fname;
		this.lname=lname;
		this.dept=dept;
	}
	protected void setId(int id) {
		this.id=id;
	}
	protected void setFname(String fname) {
		this.fname=fname;
	}
	protected void setLname(String lname) {
		this.lname=lname;
	}
	protected void setDept(String dept) {
		this.dept=dept;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getDept() {
		return dept;
	}
}
