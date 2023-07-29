package com.xworkz.appfinal;

final class Star {  //If class get final  then class cannot be inherit
	private String name;
	private String spectralClass;
	private String constellation;

	public Star(String name, String spectralClass, String constellation) {
		super();
		this.name = name;
		this.spectralClass = spectralClass;
		this.constellation = constellation;
	}

	public static void main(String[] args) {

		System.out.println("Running in main Star");
		Star star = new Star("Sun", "G2V", "None");
		System.out.println("name :" + star.name);
		System.out.println("spectralClass :" + star.spectralClass);
		System.out.println("constellation :" + star.constellation);
	}

}
