package comm.example.password;
import java.util.Scanner;
public class UserMainCode {
	private static String password;
	
	public UserMainCode() {
		super();
	}

	public UserMainCode(String password) {
	super();
	this.setPassword(password);		
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserMainCode user = new UserMainCode();
		System.out.println("Enter the password:");
		password=sc.next();
		checkPassword(password);		
	}

	public static boolean checkPassword(String password) {
		boolean valid = true;
		 if (password.length()<8)
         {
                 System.out.println("Password should be more than 8 characters");
                 valid = false;
         }
		 
         String upperCaseChars = "(.*[A-Z].*)";
         if (!password.matches(upperCaseChars ))
         {
                 System.out.println("Password should contain atleast one upper case alphabet");
                 valid = false;
         } 	
         
         String lowerCaseChars = "(.*[a-z].*)";
         if (!password.matches(lowerCaseChars ))
         {
                 System.out.println("Password should contain atleast one lower case alphabet");
                 valid = false;
         }
         
         String numbers = "(.*[0-9].*)";
         if (!password.matches(numbers ))
         {
                 System.out.println("Password should contain atleast one number");
                 valid = false;
         }
         String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
         if (!password.matches(specialChars ))
         {
                 System.out.println("Password should contain atleast one special character");
                 valid = false;
         }
         if (valid)
         {
                 System.out.println("Password is valid");
         }
         else
         {
        	System.out.println("Password is invalid");
         }
		return true;
	}


	

}
