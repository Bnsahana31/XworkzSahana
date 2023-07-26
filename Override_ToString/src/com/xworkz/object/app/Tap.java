package com.xworkz.object.app;

public class Tap {
	private String brand;
	private String model;
	private String material;
	public TapColor color;
	private double flowRate;
	
	@Override
	public String toString() {
		
		return "brand :" +this.brand +"\n" + "material :" +this.material +"\n"+
				"color :" + this.color +"\n" +  "flowRate :" + this.flowRate + "\n" 
		+ "model :" + this.model;
	}
	public String getBrand() {
		return brand;
	}
	public String getMaterial() {
		return material;
	}
	public String getModel() {
		return model;
	}
	public TapColor getColor() {
		return color;
	}
	public double getFlowRate() {
		return flowRate;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setFlowRate(double flowRate) {
		this.flowRate = flowRate;
	}
	public void setColor(TapColor color) {
		this.color = color;
	}
	

}
