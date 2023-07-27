package com.xworkz.items;

public class Assets {
	private String name;
	private int value;
	private String category;

	public Assets(String name, int value, String category) {
		super();
		this.name = name;
		this.value = value;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public String getCategory() {
		return category;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "name :" + this.name + "value :" + this.value + "category :" + this.category;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("checking object -not null");

			if (obj instanceof Assets) {
				System.out.println("matched ");

				Assets casted = (Assets) obj;
				if (this.name == casted.name && this.value == casted.value && this.category == casted.category) {
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
