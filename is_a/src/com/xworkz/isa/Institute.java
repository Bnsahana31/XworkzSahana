package com.xworkz.isa;

public class Institute {
	 String name;
     int yearFounded;
     String location;
     boolean isRecognized;

    public Xworkz(String name, int yearFounded, String location, boolean isRecognized) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.location = location;
        this.isRecognized = isRecognized;
        System.out.println("invoking arg const in Institute ");
    }
    public static void main(String[]args) {

		System.out.println("Runnig in main ");
		
		Xworkz xworkz1 = new Xworkz("ABC Institute", 2005, "CityA", true, "Engineering", "Computer Science", 500, true);
		xworkz1.printInfo();
		System.out.println("--------------------------------------------");

		Xworkz xworkz1 = new Xworkz("XYZ Academy", 2010, "CityB", true, "Management", "Business Administration", 300, true);
		xworkz1.printInfo();
}

}
