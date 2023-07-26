package com.xworkz.object.runner;

import com.xworkz.object.app.Dosa;
import com.xworkz.object.app.Dosaaccompaniments;

public class DosaRunner {
	
	public static void main (String []args) {
		
		System.out.println("Runnig in main");
		
		Dosa dosa =new Dosa();
		System.out.println(dosa.toString());
		dosa.accompaniments=Dosaaccompaniments.COCONUT_CHUNTNEY;
		dosa.setIngredients("Rice");
		dosa.setShape("Round");
		dosa.setType("Plain");
		dosa.setSize("Large");
		System.out.println("*******************************");
		
		System.out.println(dosa.toString());
		
	}

}
