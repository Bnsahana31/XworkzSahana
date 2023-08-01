package com.xworkz.abstractClass;

public abstract class Vehicle {

	public abstract void start(); // Abstract method

	public void stop() {// Concrete method common to all vehicles

		System.out.println("Vehicle stopped.");
	}
}
