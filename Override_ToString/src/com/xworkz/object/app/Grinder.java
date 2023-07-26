package com.xworkz.object.app;

public class Grinder {
	private String brand;
	public GrinderModel model;
	private int powerRating;
	private double jarCapacity;
	private boolean cordless;
	
	@Override
	public String toString() {
		
		return "brand :" + this.brand + "\n" +"jarCapacity : "+ this.jarCapacity + "\n" + 
				"power Rating :"+this.powerRating + "\n" + "model :" +this.model + "\n" +
				"cordless : "+this.cordless;
	}
	
	public String getBrand() {
		return brand;
	}
	public GrinderModel getModel() {
		return model;
	}
	public int getPowerRating() {
		return powerRating;
	}
	public double getJarCapacity() {
		return jarCapacity;
	}
	public boolean getCordless() {
		return cordless;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(GrinderModel model) {
		this.model = model;
	}
	public void setPowerRating(int powerRating) {
		this.powerRating = powerRating;
	}
	public void setJarCapacity(double jarCapacity) {
		this.jarCapacity = jarCapacity;
	}
	public void setCordless(boolean cordless) {
		this.cordless = cordless;
	}

}
