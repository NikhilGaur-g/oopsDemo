package com.valuemomentum.training.inputoutput;
//main in SerializedDemo,deserializedemo
import java.io.Serializable;

public class Employeeserial implements Serializable {
	public String name;
	public String address;
	public transient int ssn;
	public int number;
	
	/*public Employeeserial(String name, String address, int ssn, int number) {
		super();
		this.name = name;
		this.address = address;
		this.ssn = ssn;
		this.number = number;
	}*/
	
	public void mailcheck() {
		System.out.println("mailing a check to"+" "+name+" "+address);
	}
	
	
	
	
	

}
