package com.bridgelabz.programs.designPattern.proxyDesignPattern;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("");
		image.display();
		System.out.println();
		image.display();
	}

}
