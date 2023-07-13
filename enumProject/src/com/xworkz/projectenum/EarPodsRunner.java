package com.xworkz.projectenum;

public class EarPodsRunner {

	public static void main(String[] args) {
		System.out.println("running main");
		
		EarPods earPods=new  EarPods(true);
		earPods.modelName="AirPods Pro";
		earPods.setNoise(true);
		earPods.color=EarPodsColor.black;
		
		EarPods earPods1=new EarPods(false);
		earPods1.modelName="Powerbeats Pro";
		earPods1.setNoise(false);
		earPods1.color=EarPodsColor.blue;
		
		earPods.display();
		earPods1.display();
		
	

	}

}
