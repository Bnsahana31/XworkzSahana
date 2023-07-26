package com.xworkz.object.runner;

import com.xworkz.object.app.HSetWireless;
import com.xworkz.object.app.HeadSet;

public class HeadSetRunner {
	public static void mai(String[]args) {
		
		System.out.println("running in main");
		
		HeadSet headset=new HeadSet();
		System.out.println(headset.toString());
		headset.setBrand("boat");
		headset.setColor("white");
		headset.setModel("XYZ2000");
		headset.setPrice(1500);
		headset.wireless=HSetWireless.TRUE;
		
		System.out.println("***********************");
		System.out.println(headset.toString());	
	}

}
