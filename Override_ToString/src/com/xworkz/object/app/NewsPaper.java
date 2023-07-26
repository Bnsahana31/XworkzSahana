package com.xworkz.object.app;

public class NewsPaper {
	private String name;
	public NewsPaperLanguage language;
	private String publication_date;
	private String headline;
	private int  price;
	
	@Override
	public String toString() {
		
		return "name :" +this.name +"\n"+"language :" +this.language +"\n" +
		"publication_date :" + this.publication_date +"\n"+"headline :" + this.headline +
		"\n" + "price :" + this.price;
	}
	public String getName() {
		return name;
	}
	public NewsPaperLanguage getLanguage() {
		return language;
	}
	public int getPrice() {
		return price;
	}
	public String getHeadline() {
		return headline;
	}
	public String getPublication_date() {
		return publication_date;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLanguage(NewsPaperLanguage language) {
		this.language = language;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public void setPublication_date(String publication_date) {
		this.publication_date = publication_date;
	}
	

}
