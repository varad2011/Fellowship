package com.bridgelabz.programs.basiccore;

import java.util.Scanner;

public class primeFactor {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner scanner =new Scanner(System.in);
		int number=scanner.nextInt();
		int temp=number;
	
		
		for(int factorNumbers=2;factorNumbers*factorNumbers<number;factorNumbers++) 
		{
			if(temp%factorNumbers==0) 
			{
				System.out.println(factorNumbers);
				temp=temp/factorNumbers;
				factorNumbers--;
				
			}
			
			
		}
		System.out.println(temp);

	}

}
