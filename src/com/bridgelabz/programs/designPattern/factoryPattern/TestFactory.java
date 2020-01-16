package com.bridgelabz.programs.designPattern.factoryPattern;

public class TestFactory {

	public static void main(String[] args) {
		Computer server = FactoryClass.getComputer("server", "2gb", "500gb", "quadCore");
		Computer pc = FactoryClass.getComputer("PC", "3gb", "1tb", "dualCore");
		System.out.println(server);
		System.out.println(pc);		
	}

}
