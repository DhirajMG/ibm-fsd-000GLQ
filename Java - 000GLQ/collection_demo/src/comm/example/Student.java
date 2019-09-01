package comm.example;
import java.util.Comparator;
public class Student implements Comparator<Object>{
	private String name;
	private Float gpa;
	public Student() {
		super();
	}
	public Student(String name, Float gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getGpa() {
		return gpa;
	}
	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}
	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		return 0;
	}
	

}
