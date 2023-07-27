package com.jspiders.multithreadingproperties.thread;

public class MyThread extends Thread {
	@Override
	public void run()
	{
		System.out.println("the name of the thread is "+ this.getName());
		System.out.println("the priority of the thread is "+ this.getPriority());

	}
	

}
