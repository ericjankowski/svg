package com.erj.practice.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShapeTest {

	@Test
	public void triangle() {
		Shape triangle = new Shape();
		
		triangle.setNumberOfSides(3);
		
		assertEquals(3, triangle.getNumberOfSides());
		assertEquals(3.0, triangle.getPerimeter(), 0.00001);
		assertEquals(0.4330127, triangle.getArea(), 0.00001);
	}
	
	@Test
	public void square() {
		Shape square = new Shape();
		
		square.setNumberOfSides(4);
		square.setSideLength(2);
		
		assertEquals(4, square.getNumberOfSides());
		assertEquals(8.0, square.getPerimeter(), 0.00001);
		assertEquals(4.0, square.getArea(), 0.00001);
	}


}
