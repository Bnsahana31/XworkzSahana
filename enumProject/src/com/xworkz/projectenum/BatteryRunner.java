package com.xworkz.projectenum;

public class BatteryRunner {

	public static void main(String[] args) {
	System.out.println("running main");
	
	Battery battery=new  Battery(500);
	battery.batteryName="DDDDD";
	battery.setReachargeable(true);
	battery.voltage=BatteryVoltage.eight_hundred;
	
	Battery battery1=new  Battery(400);
	battery1.batteryName="SSSSS";
	battery1.setReachargeable(false);
	battery1.voltage=BatteryVoltage.seven_hundred;
	
	battery.display();
	battery1.display();
	
	
	
			

	}

}
