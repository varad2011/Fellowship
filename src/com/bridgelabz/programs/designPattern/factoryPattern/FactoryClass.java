package com.bridgelabz.programs.designPattern.factoryPattern;

public class FactoryClass {

	public static Computer getComputer(String type, String ram, String hdd, String cpu ) {
		if("server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		else if("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		}
		return null;
	}
}
