package com.jspiders.filehandling.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
	public static void main(String[]args) {
		File file=new File("ByteStreamm.txt");
		if(file.exists()) {
			System.out.println("file was already exists");
		}
		else {
			   try {
				file.createNewFile();
				System.out.println("file created");
				FileOutputStream fileOutStream=new FileOutputStream(file);
				fileOutStream.write(30);
				System.out.println("data written");
				fileOutStream.close();
			} catch (IOException e) {
				System.out.println("file is not created");
				
				e.printStackTrace();
			}
		}
	}

}
