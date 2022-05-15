package nt.comp.test;
import java.lang.reflect.Constructor;
import java.util.Date;

import com.nt.comp.Demo;
import com.nt.comp.Employee;
import com.nt.comp.Student;

public class GenericsTest {

	@SuppressWarnings("unchecked")
	public<T>T getPersonInfo(Class <T> clazz)throws Exception{
		Constructor cons[]=clazz.getDeclaredConstructors();
		return(T)cons[0].newInstance();
	}
	public static void main(String[] args) {
		try {
		GenericsTest gt=new GenericsTest();
		Employee emp=gt.getPersonInfo(Employee.class);
		emp.m1();
		emp.m2();
		System.out.println("___________________________");
		Student stud=gt.getPersonInfo(Student.class);
		stud.m1();
		stud.m3();
		System.out.println("___________________");
		
		Demo dt=gt.getPersonInfo(Demo.class);
		System.out.println(dt.toString());
		
		}catch(Exception e) {e.printStackTrace();}

	}

}
