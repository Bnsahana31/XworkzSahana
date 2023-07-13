package com.xworkz.projectenum;

public class Battery {
	String batteryName="AAA";
    double capacity;
    BatteryVoltage voltage;
    boolean isRechargeable;
    
    Battery(double capacity)
    {
    	this.capacity=capacity;
	}
    void setReachargeable(boolean isRechargeable)
    {
    	this.isRechargeable=isRechargeable;
    }
    void display()
    {
    	System.out.println("Name of the battery is  :" + batteryName);
		System.out.println("Capacity of battery is  :" + capacity);
		System.out.println("voltage of battery is  :" + voltage);
		System.out.println("The battery is charged : " + isRechargeable);
    }
}
