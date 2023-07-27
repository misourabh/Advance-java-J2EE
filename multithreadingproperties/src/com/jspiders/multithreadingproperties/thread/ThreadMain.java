package com.jspiders.multithreadingproperties.thread;

public class ThreadMain {
	
	public static void main(String [] args)
	{
	 MyThread myThread=new MyThread();
	 myThread.setName("Thread1");
	 myThread.setPriority(8);
	 myThread.start();
	 
	
	
	
	}
}
