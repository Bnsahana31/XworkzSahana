package com.xworkz.object.app;

public class HeadSet {
	private String brand;
	private String model;
	public HSetWireless wireless;
	private String color;
	private int price;
	
	@Override
	public String toString() {
		return "brand :" +this.brand +"\n" + "wireless :" +this.wireless +"\n"+
				"color :" + this.color + "/n" + "price :" + this.price +"\n"
		+ "model :" + this.model;
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public HSetWireless getWireless() {
		return wireless;
	
	}
	public String getColor() {
		return color;
	}
	public int getPrice() {
		return price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setWireless(HSetWireless wireless) {
		this.wireless = wireless;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
