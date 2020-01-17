package com.bridgelabz.programs.designPattern.singletonPattern;

public class BillPughSingleton {
	private BillPughSingleton() {
		
	}
	public static class BillPugheHelper{
		private static BillPughSingleton instance = new BillPughSingleton();
	}
	public static BillPughSingleton getInstance() {
		return BillPugheHelper.instance;
	}
	public void display() {
		System.out.println("bill pugh display");
	}

}
