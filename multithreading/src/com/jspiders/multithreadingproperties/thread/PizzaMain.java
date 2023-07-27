package com.jspiders.multithreadingproperties.thread;

public class PizzaMain 
{
   public static void main (String[]args)
   {
	    Pizza pizza=new Pizza();
	    Friends frd=new Friends(pizza);
	    Friends frd2=new Friends(pizza);

	    Dominos domi=new Dominos(pizza);
	    
	

	    frd.start();
	    frd2.start();
	    domi.start();
	    
	    
   }
}
