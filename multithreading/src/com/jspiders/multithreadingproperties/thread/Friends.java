package com.jspiders.multithreadingproperties.thread;


public class Friends extends Thread 
{
   private Pizza pizza;
   public Friends (Pizza pizza)
   {
	   this.pizza=pizza;
   }
    public void run()
    {
    	pizza.orderPizza(10);
    }
   
}
