package com.valuemomentum.training.inputoutput;

import java.io.*;

public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		DataInputStream d=new DataInputStream(new FileInputStream("c:/demo/abc.txt"));
		DataOutputStream o=new DataOutputStream(new FileOutputStream("c:/demo/county.txt"));
		String count;
		while((count=d.readLine())!=null)
		{
			String u=count.toUpperCase();
			System.out.println(u);
			o.writeBytes(u+",");
			d.close();
			
			
		}
		o.close();
		

	}

}
