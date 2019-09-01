package comm.example;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
     Vector<String> vector;
	
		vector = new Vector<String>();
		vector.add("a");
		vector.add("b");
		vector.add("c");
		Enumeration<String> e =vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	}

