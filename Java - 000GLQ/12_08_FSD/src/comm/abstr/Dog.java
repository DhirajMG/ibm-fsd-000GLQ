package comm.abstr;

public class Dog implements LivingThings{
	String name;
	String breed;
	

	public Dog() {
		super();
	}


	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public void createLivingThings() {
		LivingThings living = new LivingThings() {
			@Override
			public void walk() {
				System.out.println("Dog Name:" + getName() + "Dog Breed: " +getBreed()+"Can also walk");
			}
		};
		living.walk();
		
	}
	@Override
	public void walk() {
		System.out.println("Dog Name:" + getName() + "Dog Breed: " +getBreed()+"Can also walk");
	}
}
