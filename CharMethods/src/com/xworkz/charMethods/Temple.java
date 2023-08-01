package com.xworkz.charMethods;

public class Temple {
	
	
	
	public static void main(String[] args) {

		String name="Ganesha temple at btm";

		System.out.println(name.charAt(5));

		System.out.println(name.concat(" layout")); 

		System.out.println(name.substring(7));
		
		String name1 = "shiva temple";

		System.out.println(name.equalsIgnoreCase(name1)); 

		System.out.println(name.equals(name1));

		String name2 = "Happy Day";

		System.out.println(name.compareTo(name1)); 

		System.out.println(name.compareToIgnoreCase(name2)); 

		String name3 = "sahana";
		char n[] = name3.toCharArray();
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		System.out.println(name3.toUpperCase()); 

		System.out.println(name3.isEmpty()); 

		System.out.println(name3.length()); 

		System.out.println(name3.startsWith("S")); 

		System.out.println(name3.replace('i', 'e')); 

		System.out.println(name3.replaceAll("@", "-")); 


	}
}
