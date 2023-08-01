package com.xworkz.implemention;

import com.xworkz.abstractClass.Vehicle;

public class Car extends Vehicle {
	public final void Horn() { // Final method specific to the Car class

		System.out.println("Honk honk!");
	}

	@Override // Implementation of the abstract  method from Vehicle

	public void start() {
		System.out.println("Car started.");
	}
}