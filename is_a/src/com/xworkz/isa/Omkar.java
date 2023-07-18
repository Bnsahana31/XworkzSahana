package com.xworkz.isa;

public class Omkar extends Architect {
	 String name;
     int age;
     String expertise;
     boolean isLicensed;

    public Omkar(String name, int age, String expertise, boolean isLicensed,String firmName, String specialization, int experience, boolean isRegistered) {
    	super(firmName, specialization, experience, isRegistered);
        this.name = name;
        this.age = age;
        this.expertise = expertise;
        this.isLicensed = isLicensed;
        System.out.println("invoking arg const Omkar ");
    }
    void printInfo()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(expertise);
		System.out.println(isLicensed);
		System.out.println(firmName);
		System.out.println(specialization);
		System.out.println(experience);
		System.out.println(isRegistered);
	}

}
