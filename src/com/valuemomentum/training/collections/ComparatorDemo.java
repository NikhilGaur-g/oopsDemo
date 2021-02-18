package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Student5> al=new ArrayList<Student5>();
		Student5 s1=new Student5(111,"john","Bangalore");
		Student5 s2=new Student5(112,"jerry","Delhi");
		Student5 s3=new Student5(113,"Mike","jaipur");
		
		al.add(s3);
		al.add(s2);
		al.add(s1);
		//System.out.println("unsorted array list");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}
		Collections.sort(al, new Sortbyroll());
		System.out.println("*********Sorted by roll no***********");
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
			
		}
		Collections.sort(al, new Sortbyname());
		System.out.println("*********Sorted by name***********");
		
		

	}

}
