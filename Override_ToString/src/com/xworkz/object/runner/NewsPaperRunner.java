package com.xworkz.object.runner;

import com.xworkz.object.app.NewsPaper;
import com.xworkz.object.app.NewsPaperLanguage;

public class NewsPaperRunner {
	public static void main(String[] args) {
		System.out.println("running main");
		NewsPaper newspaper=new NewsPaper();
		System.out.println(newspaper.toString());
		newspaper.setHeadline(" World Peace Achieved");
		newspaper.language=NewsPaperLanguage.KANNADA;
		newspaper.setName("Prajavani");
		newspaper.setPrice(5);
		newspaper.setPublication_date("2023-07-26");
		
		System.out.println("*****************************");
		System.out.println(newspaper.toString());
	}	
}
