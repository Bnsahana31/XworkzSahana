package com.xworkz.village.outer;

import com.xworkz.village.inner.Village;

public class NewVillage  extends Village{
	
	public void exit() {
		System.out.println("Here protected is changed into public by using @override,Running in new Village ");
	}

}
