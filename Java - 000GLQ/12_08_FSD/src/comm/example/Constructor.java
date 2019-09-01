package comm.example;
public static void main(String[] args) {

public class Constructor {
	private int x;
	private int y;
	private int z;
	public Constructor() {
		this(10);
	}
	public Constructor(int x) {
		this(x,20);
		
	}
	public Constructor(int x,int y) {
		this(x,y,30);
	}
	public Constructor(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public String GetXYZ(x , y , z) {
		System.out.println("X = " + x + "Y = " + y + " Z = " +z);
	}
 }
}
