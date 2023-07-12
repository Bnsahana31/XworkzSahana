package com.Xworkz.Hospital;

public class Engine {
	static String engineType;
	int horsePower;
 

	static void methodStatic()
	{
		engineType="Gasoline";
	}
	Engine(int horsePower)
	{
		this.horsePower=horsePower;
		
	}
	void display() {
	        System.out.println("Static Variable: " + engineType);
	        System.out.println("Instance Variable: " + horsePower);
	}
}

