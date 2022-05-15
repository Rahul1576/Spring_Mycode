package com.nt.test;
import com.nt.Factory.Bikefactory;
import com.nt.comps.Bike;
public class FactoryPatterTest {
	public static void main(String[] args) {
		Bike bike=Bikefactory.getBike("honda");
		bike.drive();
		System.out.println("---------------------------------------");
		
		Bike bike1=Bikefactory.getBike("bajaj");
		bike1.drive();
		System.out.println("-------------------------------------------");

	}

}
