package com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails;

public class Pulses 
{
	private String name;
	private int weight;
	private int price;
	private int TotalValue ;
	
	public int getTotalValue() {
		return TotalValue;
	}
	public void setTotalValue(int totalValue) {
		TotalValue = totalValue;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
