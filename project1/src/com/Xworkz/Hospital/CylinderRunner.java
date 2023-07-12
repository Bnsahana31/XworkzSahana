package com.Xworkz.Hospital;

public class CylinderRunner {

	public static void main(String[] args) {
		
		System.out.println("running main in CylinderRunner");
		Cylinder.methodStatic();
		Cylinder instance1=new Cylinder(100);
		instance1.display();
		
		Cylinder instance2=new Cylinder(199);
		instance2.display();
		
	}
}


