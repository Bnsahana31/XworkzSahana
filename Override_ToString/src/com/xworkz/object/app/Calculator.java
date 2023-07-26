package com.xworkz.object.app;

import javax.management.loading.PrivateClassLoader;

public class Calculator {
	private String brand;
	private String color;
	public CIsScientific is_scientific;
	private int price; 
	private String display_size;
	
	@Override
	public String toString() {
		return "brand :" +this.brand +"\n" + "is_scientific :" +this.is_scientific +"\n"+
				"price :" + this.price +"\n" +  "display_size :" + this.display_size + "\n" 
		+ "color :" + this.color;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public CIsScientific getis_scientific() {
		return is_scientific;
	}
	public int getPrice() {
		return price;
	}
	public String getDisplay_size() {
		return display_size;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setColor( String color) {
		this.color=color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDisplay_size(String display_size) {
		this.display_size = display_size;
	}
	public void setIs_scientific(CIsScientific is_scientific) {
		this.is_scientific = is_scientific;
	}
}
