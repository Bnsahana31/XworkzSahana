package com.xworkz.village.inner;

public class OldVillage extends Village {
	
	@Override
	public void exit() {
		System.out.println("Here protected is changed into public by using @override,Running in Old village");
	}

}
