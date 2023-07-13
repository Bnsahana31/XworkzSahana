package com.xworkz.projectenum;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("running main ");
		
		Temple ref=new Temple("Varanasi, India");
		ref.setPrayerHall(true);
		ref.isHinduTemple=TempleHindu.FALSE;
		ref.display();
		Temple ref1=new Temple("Siem Reap, Cambodia ");
		ref1.setPrayerHall(false);
		ref1.isHinduTemple=TempleHindu.TRUE;
		ref1.display();

	}

}
