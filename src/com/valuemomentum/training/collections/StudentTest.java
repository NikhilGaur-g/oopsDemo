package com.valuemomentum.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<StudentResult> list=new ArrayList<StudentResult>();
		StudentResult s1=new StudentResult(101,"Nikhil","science",99);
		StudentResult s2=new StudentResult(102,"kamal","science",800);
		StudentResult s3=new StudentResult(103,"rakesh","science",79);
	
	    list.add(s1);
	    list.add(s2);
	    list.add(s3);
	  //  for( StudentResult s:list)
	    //{
	    	//System.out.println(s.rollno+" "+s.name+" "+s.course+" "+s.marks);
	    //}
	    Collections.sort(list);
	    Collections.reverse(list);
	    for(StudentResult s:list)
	    {
	    	System.out.println(s.rollno+" "+s.name+" "+s.course+" "+s.marks);
	    }

	}

}
