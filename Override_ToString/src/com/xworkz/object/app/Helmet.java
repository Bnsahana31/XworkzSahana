package com.xworkz.object.app;

public class Helmet {
	private String brand;
	private String model;
	public  HelmetSize size;
	private String color;
	private boolean visior;
	
	@Override
	public String toString() {
		
		return "brand :"+ this.brand + "\n" +"model :"+ this.model + "\n" +"size :" + this.size + 
				"\n" +"color :" + this.color + "\n"  + "visior :"+  this.visior;
}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public HelmetSize getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	public boolean getVisior() {
		return visior;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setSize(HelmetSize size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setVisior(boolean visior) {
		this.visior = visior;
	}
	
}
