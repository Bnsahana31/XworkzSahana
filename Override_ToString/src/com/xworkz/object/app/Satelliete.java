package com.xworkz.object.app;

public class Satelliete {
	private String name;
	private String orbitType;
	private int altitude;
	public SatellieteActive active;
	private String launchDate;
	
	@Override
	public String toString() {
		
		return "name : "+this.name +"\n"+ "orbitType : "+this.orbitType +
				"\n" + "altitude : "+ this.altitude + "\n" + "active : " + this.active +
				"\n" + "launchDate : " + this.launchDate ;
	}
	public String getName() {
		return name;
	}
	public String getOrbitType() {
		return orbitType;
	}
	public int getAltitude() {
		return altitude;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	public SatellieteActive getactive() {
		return active;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOrbitType(String orbitType) {
		this.orbitType = orbitType;
	}
	public void setActive(SatellieteActive active) {
		this.active = active;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
}
