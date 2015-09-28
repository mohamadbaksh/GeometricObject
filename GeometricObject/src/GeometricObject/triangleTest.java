package GeometricObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {
	triangle test = new triangle(1,1,1);
	@Test
	public void testGetArea() {
		double result= test.getArea();
	
	assertTrue(result == 0.4330127018922193);
	}

	@Test
	public void testGetPerimeter() {
		double perimeterresult= test.getPerimeter();
		assertTrue(perimeterresult == 3.0);
	}

}
