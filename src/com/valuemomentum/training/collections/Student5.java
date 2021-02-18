package com.valuemomentum.training.collections;

import java.util.Comparator;

public class Student5 {
	int roll;
	String name, address;
	public Student5(int roll, String name, String address) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student5 [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	

}
class Sortbyroll implements Comparator<Student5>
    {

	@Override
	public int compare(Student5 o1, Student5 o2) {
		
		return o1.roll-o2.roll;
	}
	
	}

class Sortbyname implements Comparator<Student5>
{

@Override
public int compare(Student5 o1, Student5 o2) {
	
	return o1.name.compareTo(o2.name);
}

}
