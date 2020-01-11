package com.bridgelabz.programs.basiccore;

import java.util.Scanner;

public class Factors 
{

	public static void main(String[] args) 
	{
	Scanner scanner =new Scanner(System.in);
	int number=scanner.nextInt();
	boolean primeCheckFlag=true;
	int primeNumberArray[]=new int[number];
	int arrayCount=0;
	
	for(int j=1;j<number;j++) 
	{	
		primeCheckFlag=true;
		
		if((j==0)&&(j==1)) 
		{
			
		}
		else 
		{
			for(int i=2;i<j/2;i++) 
			{
				if(j%i==0) 
				{
				//System.out.println("not prime number");
					primeCheckFlag=false;
					break;
				}
				//primeCheckFlag=true;
			}
			if(primeCheckFlag==true) 
			{
				System.out.println("given number is prime number"+j);
				primeNumberArray[arrayCount]=j;
				arrayCount++;
			}
		}
		
	}
	int temp=number;
	for(int k=2;k*k<=number;k++) 
	{
		for(int g=2;g<primeNumberArray.length;g++) 
		{
			if(temp%primeNumberArray[g]==0) 
			{
				System.out.println(primeNumberArray[g]);
				temp=temp/primeNumberArray[g];
				
			}
		}
		
	}
	System.out.println(temp);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*int primeNumCheck=30;
	int temp=n;
	int arr[]=new int[n];
	int arrCount=0;
	boolean primeCheckFlag=true;
	for(int i=1;i<primeNumCheck;i++) 
	{
		int number=primeNumCheck;
		for(int j=2;j<number/2;j++) 
		{
			if(number%j==0) 
			{
				//primeCheckFlag=false;
				break;
			}
			if(primeCheckFlag==true) 
			{
				arr[arrCount]=number;
				arrCount++;
			System.out.println(number);
			}
		}
		
	
	}
	
	
	
	
/*	for(int j=0;j<n;j++) 
	{
		
	}
	for(int k=2;k*k<=n;k++)
		{
			
			if(temp%k==0) 
			{
				
			 System.out.println(k+" ");
			 temp=temp/k;
			 
				
			}
		}
	System.out.println(temp+" ");*/

	}
}