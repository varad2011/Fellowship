package com.bridgelabz.programs.datastructure;

import java.util.Scanner;

public class BinarySearchTree 
{
	public static long calculateNode(int n) {
		long res = 0;

		// Base case
		if (n <= 1) {
			return 1;
		}
		//finding result
		for (int i = 0; i < n; i++) {
			res += calculateNode(i) * calculateNode(n - i - 1);
		}
		return (long) (res % (Math.pow(10, 8) + 7));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		System.out.println("Total number of binary trees can be made are :" + BinarySearchTree.calculateNode(number));

	}

}



	
	


