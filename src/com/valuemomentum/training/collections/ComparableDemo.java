package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"john",90));
		al.add(new Student(121,"merry",9));
		al.add(new Student(131,"Mike",50));
		
		Collections.sort(al);
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
