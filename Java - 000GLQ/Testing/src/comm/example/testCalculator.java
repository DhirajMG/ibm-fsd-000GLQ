package comm.example;

import static org.junit.Assert.*;
import junit.framework.*;

import org.junit.Test;

import junit.textui.TestRunner;

public class testCalculator extends TestCase {
	
		int x=10;
		int y=5;
		@Override 
		protected void setUp() throws Exception{
			super.setUp();
			System.out.println("In set up");
			x=10;
			y=20;
	}
		@Override 
		protected void tearDown() throws Exception{
			super.setUp();
			System.out.println("In tear down");
			x=0;
			y=0;
		}

	@Test
	public void test() {
		assertEquals(true, new Calculator(10,11).greaterMethod());
	}
	public static void main(String[] args) {
		TestRunner.run(testCalculator.class);
		
	}

}
