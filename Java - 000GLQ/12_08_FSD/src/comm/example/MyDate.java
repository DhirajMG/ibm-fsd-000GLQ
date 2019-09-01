package comm.example;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public void createDate(int d,int m,int y) {
		if(d>30) {
			System.out.println("Day cant be greater than 30");
			System.exit(0);
		}
		if(m>12) {
			System.out.println("Month cant be greater than 30");
			System.exit(0);
		}
		if(y<1990 || y>2019) {
			System.out.println("Invalid year");
			System.exit(0);
		}
		
		day=d;
		month=m;
		year=y;
	}
	
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public boolean setDay(int d)
	{
		if(d>31)
			return false;
		day = d;
		return true;
	}
	public boolean setMonth(int m)
	{
		if(m>12)
			return false;
		month = m;
		return true;
	}
	public boolean setYear(int y)
	{
		if(y<1997 || y>2019)
			return false;
		year = y;
		return true;
	}
	

}
