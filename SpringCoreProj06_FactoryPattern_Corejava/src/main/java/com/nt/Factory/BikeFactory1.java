package com.nt.Factory;
import java.lang.reflect.Constructor;
import com.nt.comps.Bike;
public class BikeFactory1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T extends Bike> T getBike(Class <T> clazz)throws Exception{
		try {
			Constructor cons[]=clazz.getDeclaredConstructors();
			return(T) cons[0].newInstance();
		}catch(Exception e) {e.printStackTrace();
		throw e;
		}
	}

}
