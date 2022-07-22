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
		
//		Student kunal;
//		System.out.println(kunal.rno);
		System.out.println(Arrays.toString(students));
			
}
	}
