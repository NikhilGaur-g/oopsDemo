package com.valuemomentum.training.inputoutput;

import java.io.*;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employeeserial e=null;
		try {
			FileInputStream fin=new FileInputStream("c:/demo/f2.txt");
			ObjectInputStream obj=new ObjectInputStream(fin);
			e=(Employeeserial)obj.readObject();
			fin.close();
			obj.close();
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		catch(ClassNotFoundException ie)
		{
			System.out.println("employee class not found");
			ie.printStackTrace();
			return;
		}
		System.out.println("deserialized employee");
		System.out.println("name"+" "+e.name);
		System.out.println("address"+" "+e.address);
		System.out.println("ssn"+" "+e.ssn);
		System.out.println("number"+" "+e.number);

	}

}
