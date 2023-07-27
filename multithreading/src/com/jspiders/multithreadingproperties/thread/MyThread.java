package com.jspiders.multithreadingproperties.thread;

public class MyThread extends Thread 
{
	@Override
	public void run() 
	{
		System.out.println("The name of thread: " + this.getName());
		System.out.println("The priority of thread:" + this.getPriority());
	}

	
}
