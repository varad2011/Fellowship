package com.bridgelabz.programs.ObjectOrientedProgram;

public class InventoryDetailsCal 
{

	private String name;
	private int  weight;
	private int price;
	private String rice1;
	private Rice rice ;
	private Pulses pulses ;
	private Wheats wheats ;

	public Wheats getWheats() {
		return wheats;
	}

	public void setWheats(Wheats wheats) {
		this.wheats = wheats;
	}

	public Pulses getPulses() {
		return pulses;
	}

	public void setPulses(Pulses pulses) {
		this.pulses = pulses;
	}

	public Rice getRice() {
		return rice;
	}

	public void setRice(Rice rice) {
		this.rice = rice;
	}

	public String getRice1() 
	{
		return rice1;
	}

	public void setRice1(String rice1) 
	{
		this.rice1 = rice1;
	}

	public void setName(String name) 
	{
		this.name = name ;
	}

	public void setweight(int weight) 
	{
		this.weight = weight ;
	}

	public void setPrice(int price) 
	{
		this.price = price ;
	}

	public int getWeight() 
	{
		return this.weight ;
	}

	public int  getPrice() 
	{
		return this.price;
	}

	public String getName() 
	{
		return this.name;
	}

}
