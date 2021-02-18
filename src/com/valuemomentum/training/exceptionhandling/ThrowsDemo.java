package com.valuemomentum.training.exceptionhandling;

public class ThrowsDemo {
	
	void division() throws ArithmeticException
	{
		int a=14,b=0,rs;
		rs=a/b;
		System.out.println("result:"+rs);
	}

	public static void main(String[] args) {
		ThrowsDemo t=new ThrowsDemo();
		try {
			t.division();
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("error:"+ Ex.getMessage());
		}
		System.out.println("end of program");

	}

}
