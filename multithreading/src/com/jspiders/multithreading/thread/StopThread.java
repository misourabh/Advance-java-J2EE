package com.jspiders.multithreading.thread;

public class StopThread extends Thread
{
	@Override
	public void run() {
		for(int i=1; i<=5;i++) {
			if(i==4) {
				this.stop();
			}
			
		     System.out.println(this.getName() + "is now running");
		}
	}

}
