package com.valuemomentum.training.exceptionhandling;

public class Tester {
	int eid,sal;
	String name;
	public Tester(int eid, int sal, String name) {
		super();
		this.eid = eid;
		this.sal = sal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tester [eid=" + eid + ", sal=" + sal + ", name=" + name + "]";
	}
	

}
