package com.xworkz.projectenum;

public class Temple {
	String templeName="Kashi Vishwanath Temple";
    String location;
    boolean hasPrayerHall;
    TempleHindu isHinduTemple;

	Temple(String location)
	{
		this.location=location;
	}
	void setPrayerHall(boolean hasPrayerHall)
	{
		this.hasPrayerHall=hasPrayerHall;
	}
	void display()
	{
		System.out.println( "Name of the temple :" + templeName);
		System.out.println("location : " + location);
		System.out.println("PrayerHall : " + hasPrayerHall);
		System.out.println("Hindu Temple : " + isHinduTemple);
	}

}
