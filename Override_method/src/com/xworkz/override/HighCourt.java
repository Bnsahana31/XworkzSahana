package com.xworkz.override;

public class HighCourt extends SupremeCourt{
	@Override
	void importantCases() {
		System.out.println("Supreme Court will Process  important Cases");
	}
	
	void criminalCases(){
		System.out.println("High Court - Process Cases");
	}
	void forgery() {
		System.out.println("High Court - Process Cases");
	}

}
