package com.nt.sbeans;
import java.util.Date;
public class WishMessageGenerator
{
	private Date date;
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator.:0-param contructor)");
	}
	public void setDate(Date date)
	{
	System.out.println("WishMessageGenerator.setdate(-)");
	this.date=date;
	}
	@SuppressWarnings("deprecation")
	public String showWishMessage(String user)
	{
		int hour=date.getHours();
		if(hour<12)
			return "Good Morning"+user;
		else if(hour<16)
			return "Good  Afternoon"+user;
			else if(hour<20)
				return "Good  Evening"+user;
			else
				return "Good Night"+user;		
	}
}