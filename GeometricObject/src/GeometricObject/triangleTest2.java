package GeometricObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest2 {
	triangle test = new triangle(3,5,7);
	@Test
	public void testGetArea() {
		double result= test.getArea();
		System.out.println(result);
	assertTrue(result == 6.49519052838329);
	}

	@Test
	public void testGetPerimeter() {
		double perimeterresult= test.getPerimeter();
		
		assertTrue(perimeterresult == 15.0);
	}

}
