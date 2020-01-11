package com.bridgelabz.programs.functional;

import java.util.Scanner;

public class Distance {
	public static int scannerReturnX() 
	{
		Scanner scanner = new Scanner ( System.in ) ;
		System.out.println ( "enter point x" ) ;
		int x = scanner.nextInt() ;
		
	return x ;
	}
	public static int scannerReturnY () 
	{	Scanner scanner = new Scanner( System.in ) ;
		System.out.println( "enter point y" ) ;
		int y = scanner.nextInt() ;
		return y ; 
	}
	public static void distanceCal (int x,int y) 
	{
		double powX=Math.pow(x, 2);
		double powY=Math.pow(y, 2);
		double addOfpowXY=powX+powY;
		double distance=Math.sqrt(addOfpowXY);
		System.out.println( "distance from the point ("+x+","+y+") to the origin (0, 0).= "+distance);
	}
	public static void main(String[] args) 
	{
		int x = Distance.scannerReturnX();
		int y = Distance.scannerReturnY();
		Distance.distanceCal(x, y);
		
	}

}
