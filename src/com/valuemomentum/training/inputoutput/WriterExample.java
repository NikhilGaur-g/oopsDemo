package com.valuemomentum.training.inputoutput;

import java.io.*;

public class WriterExample {

	public static void main(String[] args) {
		try {
			Writer w =new FileWriter("c:/demo/file1.txt");
			String content="she sells sea shells at sea";
			w.write(content);
			w.close();
			System.out.println("data written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
