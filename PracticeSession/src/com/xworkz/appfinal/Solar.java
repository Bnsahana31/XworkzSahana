package com.xworkz.appfinal;

public class Solar {
	final String sun;// cannot modify the final variables
	final String planets;
	final String moons;

	public Solar(String sun, String planets, String moons) {
		super();
		this.sun = sun;
		this.planets = planets;
		this.moons = moons;
	}

	public static void main(String[] args) {

		Solar solar = new Solar("sun", "Mercury", "Titan");

		System.out.println("running in main");
		System.out.println("sun :" + solar.sun);
		System.out.println("planets :" + solar.planets);
		System.out.println("moons :" + solar.moons);

	}

}
