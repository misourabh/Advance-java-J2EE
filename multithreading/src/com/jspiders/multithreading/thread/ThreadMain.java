package com.jspiders.multithreading.thread;

public class ThreadMain {
	public static void main(String[]args)
	{
		MyThread1 mythread1=new MyThread1();
		MyThread2 mythread2=new MyThread2();
		Thread thread=new Thread(mythread2);
		
		
		mythread1.start();
	    thread.start();
	}

}
