package com.xworkz.projectenum;

public class EarPods {
	String modelName="Pods";
	EarPodsColor color;
    boolean wireless;
    boolean NoiseCancellation;
    
    EarPods(boolean wireless)
    {
    	this.wireless=wireless;
    }
    void setNoise(boolean NoiseCancellation)
    {
    	this.NoiseCancellation=NoiseCancellation;
    }
    void display()
    {
    	System.out.println("Model Name:" + modelName);
		System.out.println("color:" + color);
		System.out.println("wireless:" + wireless);
		System.out.println("NoiseCancellation: " + NoiseCancellation);
    }

}
