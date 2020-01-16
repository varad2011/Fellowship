package com.bridgelabz.programs.designPattern.factoryPattern;

public abstract class Computer {
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCpu();
	@Override
	public String toString() {
		return "Computer [getRam()=" + getRam() + ", getHDD()=" + getHDD() + ", getcpu()=" + getCpu() + "]";
	}
}
