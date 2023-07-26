package com.xworkz.object.runner;

import com.xworkz.object.app.Satelliete;
import com.xworkz.object.app.SatellieteActive;

public class SatellieteRunner {
	

public static void main (String []args) {
		
		System.out.println("Runnig in main");
		
		Satelliete satelliete=new Satelliete();
		System.out.println(satelliete.toString());
		
		
		satelliete.setLaunchDate("2023-03-12");
		satelliete.active=SatellieteActive.FALSE;
		satelliete.setName("Satellite-1");
		satelliete.setOrbitType("Sun-synchronous");
		satelliete.setAltitude(800);
		System.out.println("********************************");
		System.out.println(satelliete.toString());
		}
}


