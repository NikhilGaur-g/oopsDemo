package com.valuemomentum.training.collections;
class Employee10{
	String name;

	public Employee10(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	
}
interface pair<K,V>
{
public K getKey();
public V getValue();
}
 class OrderedPair<K,V> implements pair<K,V>{
	
	private K key;
	private V value;
	

	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	
}
public class GenericMultipleTypeParameters {

	public static void main(String[] args) {
		OrderedPair<Integer,String> op1=new OrderedPair<Integer,String>(100,"java");
		System.out.println(op1.getKey()+" "+op1.getValue());
		
		OrderedPair<String,String> op2=new OrderedPair<String,String>("mysql","java");
		System.out.println(op2.getKey()+" "+op2.getValue());
		
		OrderedPair<Integer,Employee10> op3=new OrderedPair<Integer,Employee10>(100,new Employee10("nikhil"));
		System.out.println(op3.getKey()+" "+op3.getValue().getName());
	}

}
