package com.xworkz.itemsRunner;

import com.xworkz.items.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {

		System.out.println("running in main");

		Grocery grocery = new Grocery("rice", 1500);
		Grocery grocery1 = new Grocery("apple", 250);

		System.out.println("1st" + "\n" + grocery + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("2nd" + "\n" + grocery1 + "\n");

		boolean result = grocery.equals(grocery1);
		System.out.println("The grocery is same  : " + result);

	}

}
