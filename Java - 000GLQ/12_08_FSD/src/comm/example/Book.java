package comm.example;

public class Book extends Product {
	private String name;
	private String author;
	public Book() {
		super();
	}
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAuthor(String author) {
		this.name=author;
	}
	public String getAuthor() {
		return author;
	}

}
