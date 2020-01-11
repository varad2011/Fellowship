package com.bridgelabz.programs.logical;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter random numbers count");
		int number=scanner.nextInt();
		int arr[]=new int[number];
		Random random=new Random();
		for(int j=0;j<arr.length;j++) 
		{
			
		
			int randomNumber=random.nextInt(100);
			for(int i=0;i<arr.length;i++) 
			{
				if(randomNumber==arr[i]) 
				{
					randomNumber=random.nextInt(100);
					i=0;
				
				}
			}	
				arr[j]=randomNumber;
				
		    System.out.println(arr[j]);
		}
	}

}
