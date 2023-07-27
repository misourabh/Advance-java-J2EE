package com.jspiders.multithreadingproperties.thread;

public class MyThread1 extends Thread
{
   
   public void run()
   {
	   for(int i=1;i<=5;i++)
	   {
		   if(i==3)
		   {
             this.stop();
		   }
			  System.out.println(this.getName()+" is now running"); 

	   }
   }
}
