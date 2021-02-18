package com.valuemomentum.training.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer,Book> mapbook=new HashMap<Integer,Book>(); 
		
		
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    
	    mapbook.put(1, b1);
	    mapbook.put(2, b2);
	    mapbook.put(3, b3);
	    
	    for(Map.Entry<Integer, Book> e:mapbook.entrySet())
	    {
	    	int Key=e.getKey();
	    	Book b=e.getValue();
	    	System.out.println("Book"+Key+"Details");
	    	System.out.println(b.id+" "+b.name+" "+b.publisher+" "+b.quantity);
	    	
	    	}
	

	}

}
