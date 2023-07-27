package com.xworkz.itemsRunner;

import com.xworkz.items.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		System.out.println("running in main");

		Slipper slipper = new Slipper("Nike", 10, "Black", "Leather", "Athletic", 49.99, true);
		Slipper slipper1 = new Slipper("Adidas", 8, "White", "Synthetic", "Casual", 29.95, false);

		System.out.println("1st" + "\n" + slipper + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("2nd" + "\n" + slipper1 + "\n");

		boolean result = slipper.equals(slipper1);
		System.out.println("The slipper is same  : " + result);

	}

}
