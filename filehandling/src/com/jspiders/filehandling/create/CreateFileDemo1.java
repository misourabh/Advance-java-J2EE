package com.jspiders.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo1 {
	public static void main(String[]args) {
		File file=new File("D:/WEJA1/Hello.txt");
		if(file.exists()) {
			System.out.println("The file already exixts");
		}
		else {
		try {
			file.createNewFile();
			System.out.println("Created file");
		}
		catch(IOException e)
		{
			System.out.println("file not created");
			e.printStackTrace();
		}
		}
		}
	}