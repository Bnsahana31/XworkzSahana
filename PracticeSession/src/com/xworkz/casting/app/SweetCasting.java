package com.xworkz.casting.app;

public class SweetCasting {
	static void buy(Sweet sweet) {
		if (sweet != null) {
			System.out.println("Running Null");

		} else {
			System.out.println("provide a Valid shoe");
		}
		if (sweet instanceof RasMalai) {
			System.out.println(" casting for  puma shoe");
			RasMalai rasMalai = (RasMalai) sweet;
			rasMalai.displayInfo();
		}

		if (sweet instanceof ChampaKaly) {
			System.out.println(" casting for nike shoe");
			ChampaKaly champaKaly = (ChampaKaly) sweet;
			champaKaly.displayInfo();
		}
	}
}
