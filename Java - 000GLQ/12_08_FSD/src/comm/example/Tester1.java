package comm.example;

public class Tester1 {

	public static void main(String[] args) {
		/*PermanentEmployee perm = new PermanentEmployee(1,"abc","xyz","Testing");
		System.out.println(perm.getId());
		System.out.println(perm.getFname());
		System.out.println(perm.getLname());
		System.out.println(perm.getDept());
		System.out.println(perm.getSalary());*/
		
		Account ac = new Account(123456,"Dhiraj");
		Account new_ac=new Account(123456,"Dhiraj");
		System.out.println(ac);
		if(ac.equals(new_ac)) {
			System.out.println("Accounts are same");
		}else
				System.out.println("Accounts are not same");
				
		}
		
		

	}

}
