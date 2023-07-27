package com.jspiders.buildpattern.builder;

public class MobileMain {
	public static void main(String[]args) {
	
		Mobile mobile=new MobileBuilder().Brand("samsumg").Colour("white").getMobile();
		
		System.out.println(mobile);
	}

}
