package com.xworkz.override;

public class AppleJuice extends Juice {
	@Override
	void methodName() {
		System.out.println("Name of the juice is AppleJuice");
	}

	@Override
	void methodFlavor() {
		System.out.println("Flavor of the juice is Apple");
	}

	void methodPrice() {
		System.out.println("The price  of the Apple juice is 80rs");
	}

	public static void main(String[] args) {
		Juice juice = new Juice();
		juice.methodFlavor();
		juice.methodName();
		juice.methodQuantity();
		System.out.println("-----------------------------------");
		System.out.println("After overriding the method");
		System.out.println("------------------------------------");
		AppleJuice juice1 = new AppleJuice();
		juice1.methodFlavor();
		juice1.methodName();
		juice1.methodQuantity();
		juice1.methodPrice();

	}

}
