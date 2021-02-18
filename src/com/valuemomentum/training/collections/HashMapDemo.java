package com.valuemomentum.training.collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> lang=new HashMap();
		lang.put(1, "java");
		lang.put(2, "python");
		lang.put(3, "java script");
		System.out.println("hashmap:"+lang);
		String value=lang.get(1);
		System.out.println("value at 1:"+value);
		System.out.println("value at 3:"+lang.get(3));
		
		System.out.println("keys:"+lang.keySet());
		System.out.println("values:"+lang.values());
		lang.replace(2, "c++");
		System.out.println("key/value:"+lang.entrySet());
		System.out.println("keys");
		for(Integer keys:lang.keySet())
		{
			System.out.print(keys+"-"+lang.get(keys));
			System.out.print(",");
		}
		 // iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<Integer, String> entry : lang.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }

	}

}
