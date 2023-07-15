package com.xworkz.assosiation;

public class Movie {
	String title="Inception";
	int year;
	int rating;
	String language;
	
	Director director=new Director("Christopher Nolan",1990,"Avatar","Golden Globe");
	Movie(int year,int rating)
	{
		this.year=year;
		this.rating=rating;
	}
	void setLanguage(String language)
    {
    	this.language=language;
	}
	void display()
	{
		System.out.println("title of the movie :" + title);
		System.out.println("year :"+ year);
		System.out.println("rating :"+ rating);
		System.out.println("language :"+ language);
		this.director.printInfo();
	}
	        
	
}
