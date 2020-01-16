package com.bridgelabz.programs.designPattern.proxyDesignPattern;

public class RealImage implements Image {
	private String fileName;
	
	public RealImage(String fileName) 
	{
		this.fileName = fileName;
		loadfromDisk(fileName);
	}
	
	@Override
	public void display() {
		System.out.println("diaplay" + fileName);
	}
	private void loadfromDisk(String fileName) {
		System.out.println("fileLoaded" + fileName);
	}
}
