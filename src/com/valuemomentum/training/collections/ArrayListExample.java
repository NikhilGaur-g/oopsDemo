package com.valuemomentum.training.collections;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    //adding books to list
	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    for(Book b:list)//type obj points to collection
	    {
	    	System.out.println(b.id+" "+b.author+" "+b.name+" "+b.publisher+" "+b.quantity);
	    }

	}

}
