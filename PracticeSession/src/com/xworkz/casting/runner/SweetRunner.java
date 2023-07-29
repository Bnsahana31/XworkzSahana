package com.xworkz.casting.runner;

import com.xworkz.casting.app.ChampaKaly;
import com.xworkz.casting.app.RasMalai;

public class SweetRunner {

	public static void main(String[] args) {

		System.out.println("running main");
		System.out.println("Info of RasMalai");
		RasMalai ref1 = new RasMalai("yellow", 30, 250, 10, "Saffron");
		ref1.displayInfo();
		System.out.println("******************************");
		System.out.println("Info of ChampaKaly");
		ChampaKaly ref2 = new ChampaKaly("ChampaKaly", 5, "yellow", 18, 250);
		ref2.displayInfo();

	}

}
