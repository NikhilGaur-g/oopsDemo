package com.valuemomentum.training.inputoutput;

import java.io.*;

public class SerializedDemo {

	public static void main(String[] args) {
		Employeeserial e=new Employeeserial();
		e.name="nikhil";
		e.address="indore";
		e.ssn=1111233;
		e.number=101;
		try {
			FileOutputStream f=new FileOutputStream("c:/demo/f2.txt");
			ObjectOutputStream o=new ObjectOutputStream(f);
			o.writeObject(e);
			o.close();
			f.close();
			System.out.println("serialized data is saved in c:/demo/f2.txt");
		}
		catch(IOException i)
		{
			i.toString();
		}
		

	}

}
