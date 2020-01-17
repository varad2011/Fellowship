package com.bridgelabz.programs.designPattern.visitorPattern;

public class Fruit implements ItemElement {
	private int perKgPrice;
	private int weight;
	private String name;
	
	
	public String getName() {
		return name;
	}
	
	public Fruit(int perKgPrice, int weight, String name) {
		super();
		this.perKgPrice = perKgPrice;
		this.weight = weight;
		this.name = name;
	}
	@Override
	public int accept(ShoppingChartVisitor visitor) {
		return visitor.visit(this);
	}

	public int getPerKgPrice() {
		return perKgPrice;
	}

	public int getWeight() {
		return weight;
	}

}
