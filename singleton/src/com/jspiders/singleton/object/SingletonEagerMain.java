package com.jspiders.singleton.object;

public class SingletonEagerMain {
	
	public static void main(String[]args) {
		SingletonEager object1= SingletonEager.getobject();
		SingletonEager object2= SingletonEager.getobject();
		SingletonEager object3= SingletonEager.getobject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
	}

}
