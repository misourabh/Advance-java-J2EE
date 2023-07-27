package com.jspiders.filehandling.delete;

import java.io.File;

public class DeleteFileDemo1 {
	public static void main(String[]args) {
		File file=new File("ByStreamm.txt");
		if(file.exists()){
			file.delete();
			System.out.println("File was deleted");
			
		}
		else {
			System.out.println("file not exist");
		}
		
	}

}
