package com.bridgelabz.programs.datastructure;



import com.bridgelabz.programs.utility.Util;




public class PrimeStackAnagram {
	
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i <= 1000; i++) {
			
			if (Util.isPrime(i)) {
				String s1 = String.valueOf(i);

				
				for (int j = 0; j < 1000; j++) {
					if (Util.isPrime(j)) {
						String s2 = String.valueOf(j);
						
						if (Util.isAnagram(s1, s2)) {
							stack.push(i);
							break;
						}
					}
				}

			}
		}

		stack.show();

	}

}

