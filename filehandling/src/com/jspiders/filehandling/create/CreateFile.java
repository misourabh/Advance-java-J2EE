package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[]args) {
	File file=new File("sourabh.txt");
	if(file.exists()) {
		System.out.println("File is already there");
	}
	else { 
	try {
		file.createNewFile();
		System.out.println("The file was created");
	} catch (IOException e) {
		System.out.println("The file not Created");
		e.printStackTrace();
	}
	}	
	}
}
