package com.xworkz.projectenum;

public class Resort {
	String name="Paradise Resort";
	String ownerName;
	ResorType roomType;
	boolean  breakfast;
	Resort(String ownerName)
	{
		this.ownerName=ownerName;
	}
	void setBreakfast(boolean breakfast)
	{
		this.breakfast=breakfast;
	}
	void display()
	{
		System.out.println("name of the resort : " + name);
		System.out.println("owner Name : " + ownerName);
		System.out.println("room Type : " + roomType);
		System.out.println("breakfast : " + breakfast);
	}
}


