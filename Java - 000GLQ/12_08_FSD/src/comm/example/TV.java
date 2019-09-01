package comm.example;

public class TV extends Product{
	private String company;

	public TV() {
		super();
	}

	public TV(String company) {
		super();
		this.company = company;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	public String getCompany() {
		return company;
	}

}
