package com.Xworkz.Hospital;

public class EngineRunner {

	public static void main(String[] args) {
		System.out.println("running main in EngineRunner");
		
		Engine.methodStatic();
		Engine instance1=new Engine(300);
		instance1.display();
		
		Engine instance2=new Engine(450);
		instance2.display();

	}

}
