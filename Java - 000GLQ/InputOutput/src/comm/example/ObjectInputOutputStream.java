package comm.example;
import java.io.*;

public class ObjectInputOutputStream {

	public static void main(String[] args) {
		
		Employee employee = new Employee("10","Sachin",20000,"mumbai");
		System.out.println("Employee to write is:" + employee);
		
		try {
			FileOutputStream out = new FileOutputStream("employee.out");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(employee);
			oos.flush();
			
		}catch (Exception e) {
			System.out.println("Problem serializing:" + e);
		}
		
		try {
			FileInputStream in = new FileInputStream("employee.out");
			ObjectInputStream ois = new ObjectInputStream(in);
		}catch (Exception e) {
			System.out.println("Problem serializing:" +  e);
		}
	}

}
