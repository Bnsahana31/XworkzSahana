package com.xworkz.override;

public class FamilyCourt extends CivilCourt {
	@Override
	void propertyCase() {
		System.out.println("Civil Court will Process property Cases");
	}
	@Override
	void theftCase() {
		System.out.println("Civil court will process theft cases");
	}
	
	void DivorceCase() {
		System.out.println("Family Court will Process divorce Cases");
	}

}
