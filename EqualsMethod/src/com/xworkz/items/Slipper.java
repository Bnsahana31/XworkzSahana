package com.xworkz.items;

public class Slipper {
	private String brand;
	private int size;
	private String color;
	private String material;
	private String style;
	private double price;
	private boolean stock;

	public Slipper(String brand, int size, String color, String material, String style, double price, boolean stock) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.material = material;
		this.style = style;
		this.price = price;
		this.stock = stock;
	}

	@Override
	public String toString() {

		return "brand :" + this.brand + "\n" + "size :" + this.size + "\n" + "color :" + this.color + "\n"
				+ "material :" + this.material + "\n" + "style :" + this.style + "\n" + "price :" + this.price + "\n"
				+ "stock :" + this.stock;
	}

	public String getBrand() {
		return brand;
	}

	public int getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	public String getStyle() {
		return style;
	}

	public double getPrice() {
		return price;
	}

	public boolean getStock() {
		return stock;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("checking object -not null");

			if (obj instanceof Slipper) {
				System.out.println("matched ");

				Slipper casted = (Slipper) obj;
				if (this.brand == casted.brand && this.size == casted.size && this.color == casted.color
						&& this.material == casted.material && this.style == casted.style && this.price == casted.price
						&& this.stock == casted.stock) {
					System.out.println("Both objects are matched");
					return true;
				} else {
					System.err.println("Both objects are not same");
				}
			} else {

				System.err.println(" mis-matched");
			}
		} else {

			System.err.println("Object is null ");
		}
		return false;
	}

}
