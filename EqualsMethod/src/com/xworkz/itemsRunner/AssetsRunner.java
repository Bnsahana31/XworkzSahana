package com.xworkz.itemsRunner;

import com.xworkz.items.Assets;

public class AssetsRunner {
	public static void main(String[] args) {

		System.out.println("running in main");

		Assets assets = new Assets("Real Estate", 500000,"Property");
		Assets assets1 = new Assets("Real Estate", 500000,"Property");

		System.out.println("1st" + "\n" + assets + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("2nd" + "\n" + assets1 + "\n");

		boolean result = assets.equals(assets1);
		System.out.println("The Assets are same  : " + result);

	}

}


