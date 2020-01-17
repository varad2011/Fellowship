package com.bridgelabz.programs.designPattern.visitorPattern;

public class Book implements ItemElement {
	private int price;
	private int number;
	
	public Book(int price, int number) {
		super();
		this.price = price;
		this.number = number;
	}

	public int getPrice() {
		return price;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int accept(ShoppingChartVisitor visitor) {
		
		return visitor.visit(this);
	}

}
