package com.bridgelabz.programs.designPattern.factoryPattern;

public class Server extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public String getRam() {
		return ram;
	}
	public String getHDD() {
		return hdd;
	}
	public String getCpu() {
		return cpu;
	}
	
	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	
}
