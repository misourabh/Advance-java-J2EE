package com.jspiders.multithreadingproperties.thread;

public class Dominos extends Thread
{
	private Pizza pizza;
	   public Dominos (Pizza pizza)
	   {
		   this.pizza=pizza;
	   }
	    public void run()
	    {
	    	pizza.makePizza(10);
	    }
}
