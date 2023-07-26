package com.xworkz.object.runner;

import com.xworkz.object.app.Tap;
import com.xworkz.object.app.TapColor;

public class TapRunner {

	public static void main(String[] args) {
		System.out.println("running main");
		
		Tap tap=new Tap();
		System.out.println(tap.toString());
		tap.setBrand("Brand");
		tap.color=TapColor.BLUE;
		tap.setFlowRate(4.5);
		tap.setMaterial("Stainless Steel");
		tap.setModel("ABC123");
		
		System.out.println("*******************************");
		
		System.out.println(tap.toString());

	}

}
