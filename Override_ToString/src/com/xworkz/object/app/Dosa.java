package com.xworkz.object.app;

public class Dosa {
	private String ingredients;
	private String type;
	private String shape;
	private String size;
	public Dosaaccompaniments accompaniments;
	
	
	@Override
	public String toString() {
		
		return "Ingredients : " + this.ingredients + "\n" +
				"Type : " + this.type + "\n" +  "Shape : " + this.shape + "\n" +
				"Size : " + this.size +"\n" + "Accompaniments : " + this.accompaniments ;
	}
	
	public String getIngredients() {
		return ingredients;
	}
	public String getType() {
		return type;
	}
	public String getShape() {
		return shape;
	}
	public String getSize() {
		return size;
	}
	public Dosaaccompaniments getAccompaniments() {
		return accompaniments;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public void setAccompaniments(Dosaaccompaniments accompaniments) {
		this.accompaniments = accompaniments;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
