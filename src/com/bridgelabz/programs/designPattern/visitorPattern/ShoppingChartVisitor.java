package com.bridgelabz.programs.designPattern.visitorPattern;

public interface ShoppingChartVisitor {
	public int  visit (Book book);
	public int  visit (Fruit fruit);
}
