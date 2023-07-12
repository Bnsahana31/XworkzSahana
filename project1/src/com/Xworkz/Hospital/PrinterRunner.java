package com.Xworkz.Hospital;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("running main in PrinterRunner");
		
		Printer.methodStatic();
		Printer instance1=new Printer(300);
		instance1.display();
		
		Printer instance2=new Printer(450);
		instance2.display();
	}

}
