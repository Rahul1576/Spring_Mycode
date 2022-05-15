package com.nt.comp;

public class Test {
	private int a,b;
	public Test() {
	  System.out.println("Test:0-paramConstructor");
	}
	public Test(int a,int b) {
		  System.out.println("Test:2-paramConstructor");
		  this.a=a;
		  this.b=b;
	}
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
}
