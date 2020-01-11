package com.bridgelabz.programs.basiccore;

public class HarmonicNumber 
{

	public static void main(String[] args) 
	{
	int number =5;
	double harmonicNumber = 0;
	for(int i=1;i<number;i++) 
	{
		harmonicNumber+=(double)1/i;
	}
	System.out.println("Nth harmonic number "+harmonicNumber);

	}

}
