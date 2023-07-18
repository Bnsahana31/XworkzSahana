package com.xworkz.isa;

public class Xworkz extends Institute {
	   String instituteType;
	     String coursesOffered;
	     int studentCount;
	     boolean isAffiliated;

	    public Institute(String name, int yearFounded, String location, boolean isRecognized, String instituteType, String coursesOffered, int studentCount, boolean isAffiliated) {
	        super(name, yearFounded, location, isRecognized);
	        this.instituteType = instituteType;
	        this.coursesOffered = coursesOffered;
	        this.studentCount = studentCount;
	        this.isAffiliated = isAffiliated;
	        System.out.println("invoking arg const xworkz ");
	    }
	    void printInfo()
		{
			System.out.println(name);
			System.out.println(yearFounded);
			System.out.println(location);
			System.out.println(isRecognized);
			System.out.println(instituteType);
			System.out.println(coursesOffered);
			System.out.println(studentCount);
			System.out.println(isAffiliated);
		}
			
			
	}
	
	
	
	
	

}
