package com.xworkz.implemention;

import com.xworkz.abstractClass.Bag;

public class Handbag extends Bag {
	public final void carry() {
		System.out.println("Handbag carried.");
	}

	@Override
	public void display() {
		System.out.println("Handbag displayed.");
	}
}
