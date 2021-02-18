package com.valuemomentum.training.collections;
class Smple<T>
{
private T data;


public Smple(T data) {
	super();
	this.data = data;
}

public T getData() {
	return data;
}

public void setData(T data) {
	this.data = data;
}


}
public class GenericClassDemo {

	public static void main(String[] args) {
		Smple<Integer> s=new Smple<Integer>(15);
		//s.setData(10);
		System.out.println("integer type"+ s.getData());
		Smple<String> s1=new Smple<String>("java");
		//s1.setData("java");
		System.out.println("string data"+ s1.getData());
		
		Smple<Float> s3=new Smple<Float>(120.35f);
		//s3.setData(120.35f);
		System.out.println("float data"+ s3.getData());
		

	}

}
