package com.bridgelabz.programs.designPattern.adapterDesignPattern;

public class Socket {
	public Volt getVolts() {
	 return new Volt(120);
	}
	
}
