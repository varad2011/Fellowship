package com.bridgelabz.programs.ObjectOrientedProgram.cliniqueManagement;

public class Doctors 
{
	
	private String name ;
	private  String Specialization ;
	private  String Availability ;
	private int numberOfslot ;
	
	public int getNumberOfslot() {
		return numberOfslot;
	}
	public void setNumberOfslot(int numberOfslot) {
		this.numberOfslot = numberOfslot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		Availability = availability;
	}
	
	
}
