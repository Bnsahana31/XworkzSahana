package com.xworkz.implemention;

import com.xworkz.abstractClass.Device;

public class MobilePhone extends Device {
	public final void makeCall() {
		System.out.println("Making a call...");
	}

	@Override
	public void powerOn() {
		System.out.println("Mobile phone powered on.");
	}
}