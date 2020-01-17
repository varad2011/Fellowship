package com.bridgelabz.programs.designPattern.singletonPattern;

public class Eager {
	private static final Eager eagerInstance = new Eager();
	private Eager() {
		
	}
	public static  void displayEager() {
		System.out.println("eger is diplay");
	}
	public static Eager getEagerInstance() {
		return eagerInstance;
	}
}
