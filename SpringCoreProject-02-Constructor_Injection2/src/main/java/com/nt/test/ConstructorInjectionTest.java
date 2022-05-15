package com.nt.test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.sbeans.WishMessageGenerator;
@SuppressWarnings("deprecation")
public class ConstructorInjectionTest 
{	
	public static void main(String[] args)
	{
		System.out.println("ContructorInjectionTestMain()--start");
		FileSystemResource res=new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		System.out.println("___________________________");
		Object obj=factory.getBean("wmg");
		System.out.println("___________________________");
		WishMessageGenerator generator=(WishMessageGenerator)obj;
		String result=generator.showWishMessage("rahul");
	    System.out.println("Result="+result);
		System.out.println("___________________________");
		System.out.println("ConstructorInjectionTestMain()--end");		
	}
}