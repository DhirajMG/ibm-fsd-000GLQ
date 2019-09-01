package comm.abstr;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Flyer flyer = new Bird();
		flyer.takeoff();
		flyer.fly();*/
		
		/*Model m = new Line(10,50);
		Model m2 = new Line(10,50);
		System.out.println(m.isGreater(m,m2));
		System.out.println(m.isLesser(m,m2));
		System.out.println(m.isEqual(m,m2));*/
		
		/*Dog d = new Dog();
		d.setName("Doggo");
		d.setBreed("Good boi");
		d.walk();
		d.createLivingThings();
		LivingThings l=new Dog();
		
		l.walk();*/
		
		Messaging m = Messaging.createMessagingObject();
		Messaging m2 = Messaging.createMessagingObject("Hello");
		System.out.println(m==m2);
		
	}

}
