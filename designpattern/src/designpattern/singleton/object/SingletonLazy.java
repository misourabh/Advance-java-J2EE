package designpattern.singleton.object;

public class SingletonLazy 
{
	static SingletonLazy object;
	private SingletonLazy() {
		System.out.println("CONSTRUCTOR ACCESSED");
	}
     public static SingletonLazy getobject() {
    	 System.out.println("METHOS ACCESSED");
    	 if(object== null) {
    		 object = new SingletonLazy();
    	 }
    	 return object;
     }
}
