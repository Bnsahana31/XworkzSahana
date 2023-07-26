package com.xworkz.object.app;

public class Mixture {
	private String ingredients;
	private double weight;
	private String shape;
	public MixtureSize size;
	private int  price;
	
	
	@Override
	public String toString() {
		
		return "Ingredients : " + this.ingredients + "\n" +
				"weight : " + this.weight + "\n" +  "Shape : " + this.shape + "\n" +
				"Size : " + this.size +"\n" + "price : " + this.price ;
	}
	public String getIngredients() {
		return ingredients;
	}
	public double getWeight() {
		return weight;
	}
	public String getShape() {
		return shape;
	}
	public MixtureSize getSize() {
		return size;
	}
	public int getPrice() {
		return price;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setSize(MixtureSize size) {
		this.size = size;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}

}
