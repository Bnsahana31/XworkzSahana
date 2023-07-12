package com.Xworkz.Hospital;

public class Train {
	static String operator;
	int capacity;

	static void methodStatic()
	{
		operator="XYZ Railways";
	}
	Train(int  capacity)
	{
		this.capacity=capacity;
		
	}
	void display() {
	        System.out.println("Static Variable: " + operator);
	        System.out.println("Instance Variable: " + capacity);
	}

}
