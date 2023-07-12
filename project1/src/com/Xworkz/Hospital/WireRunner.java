package com.Xworkz.Hospital;

public class WireRunner {

	public static void main(String[] args) {
		System.out.println("running main in WireRunner");
		
		 Wire.methodStatic();
		 Wire instance1=new Wire(15);
		instance1.display();
		
		Wire instance2=new Wire(10);
		instance2.display();
		
	}

}
