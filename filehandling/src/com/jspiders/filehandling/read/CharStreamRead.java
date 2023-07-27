package com.jspiders.filehandling.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead{
	public static void main(String []args) {
		
		  File file=new File("CharStream.txt");
		  if(file.exists()) {
		try {
			   FileReader fileReader = new FileReader(file);
			   System.out.println("READING DATA IN THE FILE");
			   System.out.println("FILE OUTPUT:" + fileReader.read());
			   Scanner scanner =new Scanner(file);
			   while(scanner.hasNextLine()) {
				   System.out.println(scanner.nextLine());
			   }
			     scanner.close();
			     fileReader.close();
			   
			 } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		     }else {
        			System.out.println("FILE NOT EXISTS");
        		}
			
		}
	}

