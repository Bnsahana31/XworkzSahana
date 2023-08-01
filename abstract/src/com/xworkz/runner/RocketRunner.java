package com.xworkz.runner;

import com.xworkz.implemention.AirRocket;
import com.xworkz.implemention.SpaceRocket;

public class RocketRunner {
	public static void main(String[] args) {
		SpaceRocket spaceRocket = new SpaceRocket();
		spaceRocket.launch();
		spaceRocket.land();
		spaceRocket.deploySatellite();

		AirRocket airRocket = new AirRocket();
		airRocket.launch();
		airRocket.land();
	}

}
