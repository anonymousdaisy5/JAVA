package com.java.oops;

import java.util.*;

public class Java1 {

	public static void main(String[] args) {
		int[] rno=new int[5];// if asked to save 5 roll no.
		
		
	
		// create class, class is logical construct which provides a template for its object
		// instance variable refers to the variables outside the method but inside the class
		// for every single student
		class Student{
			int rno;
			String name;
			float marks;
		}
			
		Student [] students= new Student[5];// here student is user defined data type
		
//		Student kunal; here kunal is acting as a reference variable and is stored in stack memory . 
//		System.out.println(kunal.rno);
		// OUTPUT- it gives an error saying local variable is not initialized
		
	//	System.out.println(Arrays.toString(students));
		// OUTPUT-[null, null, null, null, null]
			// ie. when not initialized student array returns with null values
		
		//HOW TO CREATE OBJECT- 
		/* new keyword is required dynamically allocate memory and return reference to it which 
		 is stored in the variable ie. original object is in heap , we can't access the memory address (not allowed in java)
		 this is key to security in java that we cannot alter(manipulate) references in java as we can in c++ using pointers */
		
		Student student1 = new Student();
		// all the lhs side is compile time and right hand side is runtime (dynamic memory allocation )
		
		
		
		
		
}
	}

