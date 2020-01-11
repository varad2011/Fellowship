package com.bridgelabz.programs.logical;

import java.util.Scanner;

public class StopWatch 
{
	public static void  startStopWatch() 
	{
		double WatchClickTime = 0 ;
		double StorePreviousTime;
		System.out.println ( "enter 1 to start" ) ;
		Scanner scanner = new Scanner ( System.in ) ;
		int number = scanner.nextInt() ;
		WatchClickTime = System.currentTimeMillis() ;
		StorePreviousTime=WatchClickTime;
		System.out.println ( "enter 2 to start" ) ;
		number = scanner.nextInt() ;
		WatchClickTime = System.currentTimeMillis() ;
		double elapseTime = ( WatchClickTime -  StorePreviousTime  ) / 1000 ;
		System.out.println( elapseTime + "sec" ) ;
		 
	}
	public static double startWatch() 
	{	
		double startWatchTime = 0 ;
		System.out.println ( "enter 1 to start" ) ;
		Scanner scanner = new Scanner ( System.in ) ;
		int number = scanner.nextInt() ;
		if (number == 1) 
		{
		 startWatchTime = System.currentTimeMillis() ;
		}
		return startWatchTime ;
	}
	public static void stopWatch(double startWatchTime) 
	{	 double stopWatchTime = 0 ;
		System.out.println ( "enter 2 to stop" ) ;
		Scanner scanner = new Scanner ( System.in ) ;
		int number = scanner.nextInt() ;
		if( number == 2 ) 
		{
			stopWatchTime = System.currentTimeMillis() ;
			double elapseTime = ( stopWatchTime - startWatchTime ) / 1000 ;
			System.out.println(elapseTime);
		}
		
	}
	
	public static void main(String args[]) 
	{
		double startWatchTime = StopWatch.startWatch() ;
		StopWatch.stopWatch ( startWatchTime ) ;
	}
}
