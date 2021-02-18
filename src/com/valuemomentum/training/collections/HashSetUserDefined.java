package com.valuemomentum.training.collections;

import java.util.*;

public class HashSetUserDefined {

	public static void main(String[] args) {
		Set<Employee> empset=new HashSet<Employee>();
		Employee e1=new Employee(100,"nikhil",10000);
		Employee e2=new Employee(102,"nik",10002);
		Employee e3=new Employee(103,"john",10001);
		
		empset.add(e3);
		empset.add(e2);
		empset.add(e1);
		
		for(Employee e:empset)
		{
			System.out.println(e.id+" "+e.name+" "+e.sal);
		}

	}

}
