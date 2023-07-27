package com.jspiders.multithreadingproperties.thread;

public class Pizza
{
   int noOfPizza;
   
   public synchronized void  orderPizza(int orderedPizza)
   {
	   System.out.println("ordering  "+orderedPizza+" pizzaz");
	   if(orderedPizza > noOfPizza)
	   {
		   System.out.println("PLEASE WAIT...!!!");
	   }
	   try 
	   {
		this.wait();
	  } 
	    catch (InterruptedException e) 
	   {
		e.printStackTrace();
	 }
	   noOfPizza -=orderedPizza;
	   System.out.println("order of "+orderedPizza+" PIZZAS SUCCESSFUL");
	 }
       public synchronized void makePizza(int bakedPizza)
       {
    	   System.out.println("making  "+ bakedPizza+" pizza");
    	   noOfPizza +=bakedPizza;
    	   System.out.println(noOfPizza+"  PIZZAS AVAILABLE");
    	   this.notifyAll();
       }
   
   
}
