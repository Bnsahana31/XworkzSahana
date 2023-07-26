package com.xworkz.object.runner;

import com.xworkz.object.app.Helmet;
import com.xworkz.object.app.HelmetSize;

public class HelmetRunner {

	public static void main(String[] args) {
		System.out.println("Runnig in main");
		
		Helmet helmet=new Helmet();
		System.out.println(helmet.toString());
		
		helmet.setBrand("SafetyRide");
		helmet.setColor("red");
		helmet.setModel("ProShield");
		helmet.size=HelmetSize.MEDIUM;
		helmet.setVisior(false);
		
		System.out.println("********************************");
		System.out.println(helmet.toString());
	}

}
