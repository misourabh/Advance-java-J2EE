package com.jspiders.waitandnotify.main;

import com.jspiders.waitandnotify.resources.Book;
import com.jspiders.waitandnotify.thread.BookReader;
import com.jspiders.waitandnotify.thread.BookWriter;

public class BookMain {

	public static void main(String args[])
	{
	
	  Book book=new Book("HALF GIRLFRIEND");
	  BookReader pallaviReader=new BookReader(book);
	 
	 
	  
	  Thread pallaviThread=new Thread(pallaviReader,"PALLAVI");
	  
	 
	 
	  pallaviThread.start();
	 
	 
	  try {
	   Thread.sleep(1000);
	  } catch (InterruptedException e) {
	 
	   e.printStackTrace();
	  }
	  
	  BookWriter bookWriter=new BookWriter(book);
	  Thread bookWriterThread=new Thread(bookWriter);
	  bookWriterThread.start();
	 
	}
}
