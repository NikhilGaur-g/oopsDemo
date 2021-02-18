package com.valuemomentum.training.inputoutput;

import java.io.*;
import java.io.ObjectInputStream;

public class Depersist {

	public static void main(String[] args)throws Exception {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/demo/f.txt"));
		StudentSerialize s=(StudentSerialize)in.readObject();
		System.out.println(s.id+" "+s.name);
		in.close();

	}

}
