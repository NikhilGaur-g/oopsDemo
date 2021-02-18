package com.valuemomentum.training.exceptionhandling;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b,result;
		Scanner s=new Scanner(System.in);
		System.out.println("input two integers");
		a=s.nextInt();
		b=s.nextInt();
		try {
		result=a/b;
		System.out.println("Result"+ result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception caught:Division by zero");
		}
		finally {
			s.close();
			System.out.println("in finally block");
		}

	}

}
