package com.jspiders.multithreadingproperties.thread;


public class AccountMain 
{
	
	public static void main(String[] args) 
	{
		
		Account account = new Account(100000);
		
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		
		husband.start();
		wife.start();
		
	}

}