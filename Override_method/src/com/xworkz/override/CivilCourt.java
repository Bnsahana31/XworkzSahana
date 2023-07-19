package com.xworkz.override;

public class CivilCourt extends HighCourt {
	
	@Override
	void criminalCases() {
		System.out.println("High Court will Process criminal Cases");
	}
	@Override
	void forgery() {
		System.out.println("High Court will Process  forgery Cases");
	}
	void propertyCase() {
		System.out.println("Civil Court - Process Cases");
	}
	void theftCase() {
		System.out.println("Civil Court - Process Cases");
	}

}
