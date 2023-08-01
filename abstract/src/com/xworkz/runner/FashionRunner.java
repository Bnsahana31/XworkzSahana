package com.xworkz.runner;

import com.xworkz.implemention.Accessories;
import com.xworkz.implemention.Clothing;

public class FashionRunner {

	public static void main(String[] args) {
		Clothing shirt = new Clothing();
		shirt.display();
		shirt.buy();
		shirt.wear();

		Accessories bag = new Accessories();
		bag.display();
		bag.buy();

	}

}
