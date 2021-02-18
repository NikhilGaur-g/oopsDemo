package com.valuemomentum.training.collections;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("michael");
		al.add("james");
		al.add("andy");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(al.get(2));
		System.out.println(al);
		al.add(2,"nikhil");
		al.remove(0);
		al.set(1, "java");
		System.out.println("display using for each");
		for(String i:al)
		{
			System.out.println(i);
		}

	}

}
