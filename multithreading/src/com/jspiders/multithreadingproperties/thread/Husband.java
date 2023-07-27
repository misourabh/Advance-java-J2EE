package com.jspiders.multithreadingproperties.thread;


public class Husband extends Thread 
{
	
	Account account;

	public Husband(Account account) 
	{
		this.account = account;
	}
	
	@Override
	public void run() 
	{
		account.deposit(10);
		account.withdraw(20);
	}
}

