package com.xworkz.override;

public class SupremeCourt extends Court {
	
	
	
	void importantCases(){
		System.out.println("Supreme Court - Process Cases");
		
	}
	@Override
	void justice() {
		System.out.println("Court-Process a justice");
	}

}
