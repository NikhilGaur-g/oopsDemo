package com.valuemomentum.training.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		String lang[]= {"java","c","c++","python","perl"};
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(lang[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
