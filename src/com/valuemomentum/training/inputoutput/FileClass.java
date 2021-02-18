package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		File f=new File("c:/test/Hello.txt");
		try {
			
			if(f.createNewFile()) {
				System.out.println("new file created");
			}
			else {
				System.out.println("file already exist");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("name of file"+f.getName());
		System.out.println("name of file"+new Date(f.lastModified()));
		System.out.println("path:"+ f.getPath());
		System.out.println("path:"+ f.getParent());
		System.out.println("path:"+ f.length()+"bytes");
		

	}

}
