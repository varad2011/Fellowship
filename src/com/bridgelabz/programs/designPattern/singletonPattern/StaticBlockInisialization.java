package com.bridgelabz.programs.designPattern.singletonPattern;

public class StaticBlockInisialization {
	private static StaticBlockInisialization instance ;
	private StaticBlockInisialization() {
		
	}
	static {
		try {
			instance = new StaticBlockInisialization();
		}catch(Exception e){
			throw new RuntimeException("exception occurred in creation of singleton pattern");
		}
	}
	public static StaticBlockInisialization getInstance() {
		return instance;
	}
	public void display() {
		System.out.println("static block inisialization display");
	}
	
}
