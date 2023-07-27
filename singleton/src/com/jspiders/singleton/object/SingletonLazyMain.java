package com.jspiders.singleton.object;

public class SingletonLazyMain {
	public static void main(String[]args) {
		
		SingletonLazy object1= SingletonLazy.getobject();
		SingletonLazy object2= SingletonLazy.getobject();
		SingletonLazy object3= SingletonLazy.getobject();
		
		System.out.println(object1);
		System.out.println(object2);
		System.out.println(object3);
		
	}

}
