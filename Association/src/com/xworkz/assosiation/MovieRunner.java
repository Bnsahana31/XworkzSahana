package com.xworkz.assosiation;

public class MovieRunner {

	public static void main(String[] args) {

		System.out.println("running main");
		
		Movie movie=new Movie(2023,5);
		movie.setLanguage("kannada");
		movie.display();
	}

}
