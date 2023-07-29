package com.xworkz.superChaining;

public class MasalaDosa extends Dosa {
	private boolean spicy;

	public MasalaDosa(String type, double price, String location, boolean spicy) {
		super(type, price, location);
		this.spicy = spicy;
	}

	public void printInfo() {
		super.display();
		System.out.println("dosa is spicy :" + spicy);
	}

	public static void main(String[] args) {

		System.out.println("Running in main");

		MasalaDosa dosa = new MasalaDosa("Masala Dosa", 60, "BTM", true);
		dosa.printInfo();
		System.out.println("**************************");
		MasalaDosa dosa1 = new MasalaDosa("Plain Dosa ", 55, "BTM", false);
		dosa1.printInfo();

	}

}
