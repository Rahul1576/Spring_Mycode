package com.nt.test;
import com.nt.Factory.BikeFactory1;
import com.nt.comps.BajajBike;
import com.nt.comps.Bike;
import com.nt.comps.HeroBike;

public class FactoryPatternTest1 {
	public static void main(String[] args) {
		try {
		Bike bike=BikeFactory1.getBike(BajajBike.class);
		bike.drive();
		System.out.println("----------------------------------");
		
		Bike bike1=BikeFactory1.getBike(HeroBike.class);
		bike1.drive();
		System.out.println("------------------------------------------");
		}catch(Exception e) {e.printStackTrace();}
	}
}
