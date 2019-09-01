package comm.example;

public class PermanentEmployee extends Employee{
	protected int salary;
	public PermanentEmployee(int id,String fname,String lname,String dept) {
		super(id,fname,lname,dept);
		this.salary=45000;
	}
	public PermanentEmployee(int id,String fname,String lname,String dept,int salary) {
		super(id,fname,lname,dept);
		this.salary=salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}

}
