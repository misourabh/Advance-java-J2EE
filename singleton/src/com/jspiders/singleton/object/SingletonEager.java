package com.jspiders.singleton.object;

public class SingletonEager {
	
	static SingletonEager object=new SingletonEager();
	
	private SingletonEager() {
		System.out.println("Constructor acessed");
	}
	 public static SingletonEager getobject() {
		 System.out.println("method acessed");
		return object;
	 }
	    

}
