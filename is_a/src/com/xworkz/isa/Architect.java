package com.xworkz.isa;

public class Architect {
	  String firmName;
	     String specialization;
	     int experience;
	     boolean isRegistered;

	    public Architect(String firmName, String specialization, int experience, boolean isRegistered) {
	        
	        this.firmName = firmName;
	        this.specialization = specialization;
	        this.experience = experience;
	        this.isRegistered = isRegistered;
			System.out.println("invoking arg const in Architect ");

	    }
	    public static void main(String[]args) {

			System.out.println("Runnig in main ");
			
			Omkar omkar1 = new Omkar("John Doe", 40, "Residential Buildings", true, "ABC Architects", "Green Architecture", 15, true);
			omkar1.printInfo();
			System.out.println("--------------------------------------------");

			Omkar omkar2 = new Omkar("Jane Smith", 35, "Commercial Complexes", true, "XYZ Designers", "Sustainable Design", 10, true);
			omkar2.printInfo();
	}



}
