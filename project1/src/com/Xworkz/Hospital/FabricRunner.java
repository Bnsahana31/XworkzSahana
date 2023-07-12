package com.Xworkz.Hospital;

public class FabricRunner {
	public static void main(String[] args) {
		
		System.out.println("running main in FabricRunner");
		
		Fabric.methodStatic();
		Fabric instance1=new Fabric("green");
		instance1.display();
		
		Fabric instance2=new Fabric("red");
		instance2.display();
	}
}
