package com.xworkz.object.runner;

import com.xworkz.object.app.Mixture;
import com.xworkz.object.app.MixtureSize;

public class MixtureRunner {

	public static void main(String[] args) {
		System.out.println("running in main");
	
		Mixture mixture=new Mixture();
		
		System.out.println(mixture.toString());
		mixture.setIngredients("Flour");
		mixture.setPrice(50);
		mixture.setShape("ROUND");
		mixture.size=MixtureSize.SMALL;
		mixture.setWeight(250);
		
		System.out.println("************************");
		System.out.println(mixture.toString());
		
	}

}
