package com.nt.test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.sbeans.WishMessageGenerator;
@SuppressWarnings("deprecation")
public class SetterInjectionTest 
{	
	public static void main(String[] args)
	{
		System.out.println("SetterInjectionTestMain()--start");
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("wmg");
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		String result=generator.showWishMessage("raja");
	    System.out.println("Result="+result);
		System.out.println("SetterInjectionTestMain()--end");		
	}
}