package com.valuemomentum.training.exceptionhandling;

public class Stringbufferdemo1 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("jamesGoslings");
		int l=str.length();
		System.out.println("length of string is:"+l);
		System.out.println("capacity of string is:"+str.capacity());
		//System.out.println("reversed string is:"+str.reverse());
		System.out.println("sub string is:"+str.substring(0, 5));
		str.replace(5,10, "java");
		System.out.println(str);
		str.delete(2, 5);
		System.out.println(str);
		System.out.println("reversed string is:"+str.reverse());
		

	}

}
