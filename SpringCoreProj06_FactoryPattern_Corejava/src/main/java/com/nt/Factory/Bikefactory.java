package com.nt.Factory;
import com.nt.comps.BajajBike;
import com.nt.comps.HondaBike;
import com.nt.comps.HeroBike;
import com.nt.comps.Bike;
public class Bikefactory {
	//static factory method
	public static Bike getBike(String type) {
		Bike bike=null;
		if(type.equalsIgnoreCase("bajaj"))
			bike=new BajajBike();
		else if(type.equalsIgnoreCase("hero"))
			bike=new HeroBike();
		else if(type.equalsIgnoreCase("honda"))
			bike=new HondaBike();
		else
			throw new IllegalArgumentException("Invalid Bike Type");
		return bike;
	}
}
