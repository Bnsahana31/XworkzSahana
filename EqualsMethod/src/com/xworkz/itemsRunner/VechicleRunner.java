package com.xworkz.itemsRunner;

import com.xworkz.items.Vechicle;

public class VechicleRunner {

	public static void main(String[] args) {
		System.out.println("running in main");

		Vechicle vechicle = new Vechicle("Toyota", "Corolla", 2018, "Silver", 45000);
		Vechicle vechicle1 = new Vechicle("Honda", "Civic", 2020, "Black", 32000);

		System.out.println("1st" + "\n" + vechicle + "\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("2nd" + "\n" + vechicle1 + "\n");

		boolean result = vechicle.equals(vechicle1);
		System.out.println("The vechicle is same  : " + result);

	}

}
