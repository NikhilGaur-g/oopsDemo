package com.valuemomentum.training.collections;

import java.util.*;

public class PlayerList {
	ArrayList playerarray;
	List sublistobj;
	PlayerList()
	{
		playerarray=new ArrayList();
		sublistobj=new ArrayList();
	}
	void add() {
		for(int ctr=0;ctr<5;ctr++)
			playerarray.add(new Integer(ctr));
		{
			playerarray.add("martina");
			playerarray.add("serena");
			playerarray.add("venus");
			playerarray.add("serena");
		}
		
			
	}
	void extract()
	{
		System.out.println("***************************"
		        + "*********************");
		        System.out.println("Extract a sublist and "
		        + "then print the new List ");
		        System.out.println("************************"
		        + "*************************");
		        System.out.println();
		        sublistobj=playerarray.subList(5, playerarray.size());
		        System.out.println("new sub_list from index 5 to"+playerarray.size()+"is"+sublistobj);
		        System.out.println();
	}
	void search()
	{
		 System.out.println("************************************"
			        + "***********************");
			        System.out.println("Search for an object and return "
			        + "the first and last position");
			        System.out.println("*********************************"
			        + "***************************");
			        System.out.println();
			        System.out.println("first occurance of the string"+"\"serena\"is at position"+playerarray.indexOf("serena"));
			        System.out.println("last occurance of the string"+"\"serena\"is at position"+playerarray.lastIndexOf("serena"));
			        System.out.println();
	}
	void display()
	{
		System.out.println("**********************"
		        + "****************");
		      System.out.println("Retrieve objects from the ArrayList");
		      System.out.println("*******************"
		      + "*******************");
		      System.out.println();
		      for (int ctr = 0; ctr < playerarray.size(); ctr++) {
		           System.out.print(" " + playerarray.get(ctr));}
	}

	public static void main(String[] args) {
		
		PlayerList p=new PlayerList();
		p.add();
		p.extract();
		p.search();
		p.display();
		
		

	}

}
