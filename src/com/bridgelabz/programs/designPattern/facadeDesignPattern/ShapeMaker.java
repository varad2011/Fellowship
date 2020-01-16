package com.bridgelabz.programs.designPattern.facadeDesignPattern;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	public void drawCircle() {
		circle.drawShape();
	}
	public void drawRectangle() {
		rectangle.drawShape();
	}
	public void drawSquare() {
		square.drawShape();
	}
}
