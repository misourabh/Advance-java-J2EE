package com.jspiders.multithreadingproperties.thread;

public class Thread1Main 
{
	public static void main(String[]args)
	{
		MyThread1 myThread1=new MyThread1();
		myThread1.setName("Thread1");
		myThread1.start();
	}

}
