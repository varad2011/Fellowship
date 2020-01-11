package com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails;


import java.util.List;

import com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails.Pulses;
import com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails.Rice;
import com.bridgelabz.programs.ObjectOrientedProgram.inventoryDetails.Wheats;

public class InventoryDetail 
{
	private List<Rice> rice ;
	private List<Pulses> pulses ;
	private List<Wheats> wheats ;
	public List<Rice> getRice() {
		return rice;
	}
	public void setRice( List<Rice> rice) {
		this.rice = rice;
	}
	public  List<Pulses> getPulses() {
		return pulses;
	}
	public void setPulses( List<Pulses> pulses) {
		this.pulses = pulses;
	}
	public  List<Wheats> getWheats() {
		return wheats;
	}
	public void setWheats( List<Wheats> wheats) {
		this.wheats = wheats;
	}
	public InventoryDetail() {
		super();
		
	}
	
	
}
