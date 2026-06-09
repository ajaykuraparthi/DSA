package com.oops;

import java.util.Arrays;

public class BasicClass {
	public static void main(String args[]) {
		
		// store 5 roll nos
		
		int numbers[] = new int[5];
		
		// store 5 names
		
		String names[] = new String[5];
		
		// data of 5 students : {roll no , name , marks}
		
		int rno[] = new int[5];
		String name[] = new String[5];
		float marks[] = new float[5];
		
		
		 
		Student std[] = new Student[5];
		
		// just declaring
//		
//		Student ajay;
		
		Student ajay  = new Student("ajay",68,99);
		
//		ajay.name = "Aj";
//		ajay.rno = 6068;
//		ajay.marks = 88.69f;
//		
//		System.out.println(ajay.name);
//		System.out.println(ajay.marks);	
//		System.out.println(ajay.rno);
//			 
//		ajay.changeName("nature lover");
//		ajay.greeting();
		
//		Student random = new Student(ajay);
//		System.out.println(random.name);
		
		Student random2 = new Student();
		System.out.println(random2.name);
	}  
	 
}
//now i am gonna create a class
	// for every single student
class Student{
	int rno;
	String name;
	float marks;
	
	// we need a way to add the values of the above properties object
	// by object
	
	// we need one word to access every object
	
	void greeting() {
		System.out.println("Hello my name is : " + name);
	}
	
	void changeName(String newName) {
		name = newName;
	}
	
//	Student(){
//		this.name = "Aj";
//		this.rno = 6068;
//		this.marks = 88.69f;
//	}
//	
	Student (){
		// this is how you call a constructer from another constructer
		// internally : new Student(17, " Arpit", 89.f);
		this ("default person",13,100.0f);
	}
	
	// Student arpit = new Student(17, " Arpit", 89.f);
	// here this will be replaced with arpit
	
	Student(String name,int rno,float marks){
		this.name = name;
		this.rno = rno;
		this.marks = marks;
}
	
//	Student(Student other){
//		this.name = other.name;
//		this.rno = other.rno;
//		this.marks = other.marks;
//	}

}
















