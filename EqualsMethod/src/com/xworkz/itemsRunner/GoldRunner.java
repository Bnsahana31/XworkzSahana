package com.xworkz.itemsRunner;

import com.xworkz.items.Gold;

public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("running in main");

		Gold gold = new Gold("Gold Bar", 100, 62.50, 99.9, "Switzerland");
		Gold gold1 = new Gold("Gold Coin", 20, 67.80, 98.5, "United States");

		System.out.println("1st" + "\n" + gold + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("2nd" + "\n" + gold1 + "\n");

		boolean result = gold.equals(gold1);
		System.out.println("The gold is same  : " + result);

	}

}
