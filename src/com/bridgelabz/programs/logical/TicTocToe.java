package com.bridgelabz.programs.logical;

import java.util.Random;
import java.util.Scanner;

public class TicTocToe 
{

	public static void main(String[] args) 
	{
		String arr[]=new String[9];
		Scanner scanner =new Scanner(System.in);
		Random random=new Random();
		int player1EnterNumber,player2EnterNumber;
		int temporaryArray[]=new int[9];
		int temporaryArrayCount=0;
		int cellNumber=0;
		boolean player1Flag=false;
		boolean player1PlayFlag=true;
		boolean winFlag=false;
		
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=" ";
			
		}
		System.out.println("|-"+arr[0]+"-|-"+arr[1]+"-|-"+arr[2]+"-|"+"\n"
				+"|-"+arr[3]+"-|-"+arr[4]+"-|-"+arr[5]+"-|"+"\n"
				+"|-"+arr[6]+"-|-"+arr[7]+"-|-"+arr[8]+"-|");
		
		for(int loopIterator=0;loopIterator<arr.length;loopIterator++) 
		{
			if(player1PlayFlag==true) 
			{	System.out.println("please enter cell number");
				player1EnterNumber=scanner.nextInt();
				for(int k=0;k<temporaryArray.length;k++) 
				{
					if(temporaryArray[k]==player1EnterNumber) 
					{
						System.out.println("player enter number is already present"+"\n"+"please enter unfill cell number");
						player1EnterNumber=scanner.nextInt();
						k=0;
					}
					
					
				}
				
				cellNumber=player1EnterNumber;
				player1Flag=true;
				temporaryArray[temporaryArrayCount]=player1EnterNumber;
				temporaryArrayCount++;
				player1PlayFlag=false;
			}
			else 
			{
				if(player1PlayFlag==false) 
				{	
					player2EnterNumber=random.nextInt(10);
					for(int arrayLocationNum=0;arrayLocationNum<temporaryArray.length;arrayLocationNum++) 
					{
						if(temporaryArray[arrayLocationNum]==player2EnterNumber) 
						{
							player2EnterNumber=random.nextInt(10);
							arrayLocationNum=0;
						}
						
					}
					cellNumber=player2EnterNumber;
					temporaryArray[temporaryArrayCount]=player2EnterNumber;
					temporaryArrayCount++;
					player1PlayFlag=true;
				}
				
			}
			
			
			
			switch(cellNumber) 
			{
			case 1:
				if(player1Flag==true) 
				{
					arr[0]="X";
					player1Flag=false;
				}
				else 
				{
					arr[0]="O";
				}
				break;
				
			case 2:
				if(player1Flag==true) 
				{
					arr[1]="X";	
					player1Flag=false;
				}
				else
				{
					arr[1]="O";
				}
				break;
				
			case 3:
				if(player1Flag==true) 
				{
					arr[2]="X";	
					player1Flag=false;
				}
				else
				{
					arr[2]="O";
				}
				break;
				
			case 4:
				if(player1Flag==true) 
				{
					arr[3]="X";	
					player1Flag=false;
				}
				else
				{
					arr[3]="O";
				}
				break;
				
			case 5:
				if(player1Flag==true) 
				{
					arr[4]="X";	
					player1Flag=false;
				}
				else
				{
					arr[4]="O";
				}
				break;
				
			case 6:
				if(player1Flag==true) 
				{
					arr[5]="X";
					player1Flag=false;
				}
				else
				{
					arr[5]="O";
				}
				break;
				
			case 7:
				if(player1Flag==true) 
				{
					arr[6]="X";
					player1Flag=false;
				}
				else
				{
					arr[6]="O";
				}
				break;
				
			case 8:
				if(player1Flag==true) 
				{
					arr[7]="X";
					player1Flag=false;
				}
				else
				{
					arr[7]="O";
				}
				break;
				
			case 9:
				if(player1Flag==true) 
				{
					arr[8]="X";
					player1Flag=false;
				}
				else
				{
					arr[8]="O";
				}
				break;
				
			}
			
			System.out.println("|-"+arr[0]+"-|-"+arr[1]+"-|-"+arr[2]+"-|"+"\n"
					+"|-"+arr[3]+"-|-"+arr[4]+"-|-"+arr[5]+"-|"+"\n"
					+"|-"+arr[6]+"-|-"+arr[7]+"-|-"+arr[8]+"-|"+"\n");
			if(((arr[0]==arr[1])&&(arr[1]==arr[2]))&&(arr[0]!=" ")) 
			{
				//System.out.println("player win game");
				winFlag=true;
				break;
			}
			if(((arr[3]==arr[4])&&(arr[4]==arr[5]))&&(arr[3]!=" ")) 
			{
				winFlag=true;
				break;
			}
			if(((arr[6]==arr[7])&&(arr[7]==arr[8]))&&(arr[6]!=" ")) 
			{
				winFlag=true;
				break;
			}
			if(((arr[0]==arr[3])&&(arr[3]==arr[6]))&&(arr[0]!=" ")) 
			{
				winFlag=true;
				break;
			}
			if(((arr[1]==arr[4])&&(arr[4]==arr[7]))&&(arr[1]!=" ")) 
			{
				winFlag=true;
				break;
			}
			if(((arr[2]==arr[5])&&(arr[5]==arr[8]))&&(arr[2]!=" ")) 
			{
				winFlag=true;
				break;
			}
			if(((arr[0]==arr[4])&&(arr[4]==arr[8]))&&(arr[0]!=" ")) 
			{
				winFlag=true;
				break;
			}
			if(((arr[2]==arr[4])&&(arr[4]==arr[6]))&&(arr[2]!=" ")) 
			{
				winFlag=true;
				break;
			}
		}
		if(winFlag==true) 
		{
			System.out.println("player win game");
		}
		else 
		{
		 	System.out.println("player loss game");
		}
		
		

	}

}
