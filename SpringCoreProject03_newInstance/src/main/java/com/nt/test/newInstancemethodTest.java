package com.nt.test;
import java.lang.reflect.Constructor;
public class newInstancemethodTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			Class c=Class.forName(args[0]);
			Constructor cons[]=c.getDeclaredConstructors();
			Object ob1=cons[0].newInstance();
			System.out.println(ob1);
			System.out.println("_______________________");
			Object ob2=cons[1].newInstance(10,20);
			System.out.println(ob2);
		}catch(Exception e) {e.printStackTrace();}

	}
}