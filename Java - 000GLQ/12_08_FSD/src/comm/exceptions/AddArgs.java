package comm.exceptions;

public class AddArgs {
	public static void main(String args[]) {
		int sum=0;
		for(String a:args)
		{
			
			try{
				sum+=Integer.parseInt(a);
			}
		catch(NumberFormatException nfe) {
			System.err.println(nfe.getMessage());
			System.exit(0);
		}
		}
		System.out.println("Sum:"+ sum);
		
	}
	

	
}
