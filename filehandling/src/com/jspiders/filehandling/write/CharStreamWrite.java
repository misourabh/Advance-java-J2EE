package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {
	public static void main(String[]args) {
		File file=new File("CharStream.txt");
		
		if(file.exists()) {
			System.out.println("file is already exist");
		}
		try {
			file.createNewFile();
			System.out.println("file is created");
			FileWriter fileWriter=new FileWriter(file);
			fileWriter.write("data from program");
			System.out.println("Data written to file");
			fileWriter.close();
			
		}
		  catch (IOException e){
			  System.out.println("file not created");
			  e.printStackTrace();
			
		}
	}

}
