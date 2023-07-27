package com.jspiders.multithreadingproperties.thread;

import com.jspiders.multithreading.thread.StopThread;

public class Thread3Main 
{
	public static void main(String args[]) {
		
		StopThread stopThread = new StopThread();
		stopThread.setName("sourabh");
		stopThread.start();
	}

}
