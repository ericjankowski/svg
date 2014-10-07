package com.erj.practice.domain;

public class Shape {

	private int numberOfSides;
	private double lengthOfSide = 1.0;

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public double getPerimeter() {
		return lengthOfSide * numberOfSides;
	}

	public void setSideLength(double lengthOfSide) {
		this.lengthOfSide = lengthOfSide;
	}

	public double getArea() {
		return 0.25*numberOfSides*lengthOfSide*lengthOfSide * (1.0/Math.tan(Math.PI/numberOfSides));
	}
	
	public String getPoints(){
		double width = 400.0;
		double center = width * 0.5;
		double radius = center * 0.75;
		double angle = 2 * Math.PI / numberOfSides;
		double x = center;
		double y = center - radius;
		
		String points = "" + x + "," + y + " ";

		for (int i = 1; i<= numberOfSides; i++){
			x = center + ((Math.sin(angle * i)))*radius;
			y = center - ((Math.cos(angle * i)))*radius;
			points += x + "," + y + " ";
		}
		
		return points;
	}

}
