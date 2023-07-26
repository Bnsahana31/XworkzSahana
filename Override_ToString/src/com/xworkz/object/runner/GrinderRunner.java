package com.xworkz.object.runner;

import com.xworkz.object.app.Grinder;
import com.xworkz.object.app.GrinderModel;

public class GrinderRunner {

	public static void main(String[] args) {
		System.out.println("Runnig in main");

		Grinder grinder=new Grinder();
		System.out.println(grinder.toString());
		grinder.setBrand("PowerBlenders");
		grinder.setCordless(false);
		grinder.setJarCapacity(2.5);
		grinder.model=GrinderModel.SuperGrind;
		grinder.setPowerRating(1500);
		
		System.out.println("********************************");
		
		System.out.println(grinder.toString());

	}

}
