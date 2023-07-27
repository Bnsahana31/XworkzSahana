package com.xworkz.itemsRunner;

import com.xworkz.items.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {

		System.out.println("running in main");

		DryFruit dryFruit = new DryFruit("Almonds", 250, 15.99, "California, USA");
		DryFruit dryFruit1 = new DryFruit("Cashews", 200, 12.50, "India");

		System.out.println("1st" + "\n" + dryFruit + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("2nd" + "\n" + dryFruit1 + "\n");

		boolean result = dryFruit.equals(dryFruit1);
		System.out.println("The dryFruit is same  : " + result);

	}
}
