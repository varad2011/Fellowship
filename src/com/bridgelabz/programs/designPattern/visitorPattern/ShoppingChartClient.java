package com.bridgelabz.programs.designPattern.visitorPattern;

public class ShoppingChartClient {

	public static void main(String[] args) {
		ItemElement[] itemElement  = new ItemElement[]{new Book(20, 1234),new Book(100, 5678),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
		int total = calculatePrice(itemElement);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElement[] itemElement) {
		ShoppingChartVisitor visitor = new ShopingChartVisitorlmpl();
		int sum=0;
		for(ItemElement item : itemElement){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}
