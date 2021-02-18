package com.valuemomentum.training.collections;

public class StudentResult implements Comparable<StudentResult>{
	int rollno,marks;
	String name,course;
	
	public StudentResult(int rollno, String name, String course,int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.marks = marks;
		


}

	@Override
	public int compareTo(StudentResult o) {
		if(marks==o.marks) 
			return 0;
			
			else if(marks>o.marks)
				return 1;
			else 
				return -1;

	}
	
}