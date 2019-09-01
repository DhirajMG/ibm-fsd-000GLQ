package comm.exceptions;

public class Tester {

	public static void main(String[] args) {
		Person per = new Person();
		Person per1=new Person();
		try {
			per1=per.createName("abc","xyz");
			
		}
		catch(PersonException e){
			System.err.println(e);		
			
			
			
		}

	}

}
