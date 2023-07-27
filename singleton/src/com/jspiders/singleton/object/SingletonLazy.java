package com.jspiders.singleton.object;

public class SingletonLazy {
	static SingletonLazy object;
	
	private SingletonLazy() {
		System.out.println("constructor acessed");
	}
	  public static SingletonLazy getobject() {
		  System.out.println("method acessed");
		 
		  if(object==null) {
			  object=new SingletonLazy();
		  }
		  return object;
	  }

}
