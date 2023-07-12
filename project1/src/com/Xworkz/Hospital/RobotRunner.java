package com.Xworkz.Hospital;

public class RobotRunner {

	public static void main(String[] args) {
System.out.println("running main in RobotRunner");
		
Robot.methodStatic();
Robot instance1=new Robot(50);
		instance1.display();
		
		Robot instance2=new Robot(60);
		instance2.display();

		

	}
}


