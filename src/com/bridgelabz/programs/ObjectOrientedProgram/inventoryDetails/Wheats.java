package com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails;

public class Wheats 
{
	private String name ;
	private int  weight ;
	private int price ;
	private int totalValue ;
	
	
	
	public int getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public Wheats() 
	{
		
	}
	
	public Wheats(String name, int weight, int price) 
	{
		super() ;
		this.name = name ;
		this.weight = weight ;
		this.price = price ;
	}
	
	public String getName() 
	{
		return name ;
	}
	public void setName(String name) 
	{
		this.name = name ;
	}
	public int getWeight() 
	{
		return weight ;
	}
	public void setWeight(int weight) 
	{
		this.weight = weight ;
	}
	public int getPrice() 
	{
		return price ;
	}
	public void setPrice(int price) 
	{
		this.price = price ;
	}
	
	
}
