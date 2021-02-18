package com.valuemomentum.training.inputoutput;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) throws Exception {
		StudentSerialize s=new StudentSerialize(101,"nikhil");
		FileOutputStream fout=new FileOutputStream("c:/demo/f.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(s);
		out.flush();
		System.out.println("success");

	}

}
