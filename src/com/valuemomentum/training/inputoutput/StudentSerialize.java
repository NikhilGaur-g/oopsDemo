package com.valuemomentum.training.inputoutput;
//main serialize in persist,main deserialize in depersist
import java.io.Serializable;

public class StudentSerialize implements Serializable{
	int id;
	String name;
	public StudentSerialize(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

}
