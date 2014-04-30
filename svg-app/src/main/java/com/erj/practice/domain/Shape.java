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

}
