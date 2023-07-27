package com.jspiders.multithreadingproperties.thread;

public class SetMain 
{
	public static void main(String[]args)
	{
		SetExample ex1=new SetExample();
		ex1.setName("TEJAS");
		ex1.setPriority(1);
		ex1.start();
	}

}
