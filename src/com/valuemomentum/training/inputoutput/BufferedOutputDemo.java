package com.valuemomentum.training.inputoutput;
import java.io.*;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

class BufferedOutputDemo
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("c:/demo/f1.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Sachin is my Favourite Player";
		byte b[]=s.getBytes();
		bout.write(b);
		
		bout.flush();
		bout.close();
		bout.close();
		System.out.println("Success");
	}
	
}
/*class BufferedOutputDemo{  

	public static void main(String args[]) throws Exception{  

   FileOutputStream fout=new FileOutputStream("c:/demo/f1.txt");  
   BufferedOutputStream bout=new BufferedOutputStream(fout);  
   String s="Sachin is my favourite player";  
   byte b[]=s.getBytes();  
   bout.write(b);  
  
   bout.flush();  
   bout.close();  
   fout.close();  
   System.out.println("success");  
 }  
} */