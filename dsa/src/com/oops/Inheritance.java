package com.oops;

 class owner{
	String ownerName = "Aj";
	int age = 20;
	int num = 123;
	
	void dis() {
		 System.out.println(2);
	 }
}
 
// class chaishop extends owner{
//	 
//	public void display(int num) {b
//		System.out.println("hi machha " + num);
//		}
// }

class shop extends owner{
	                   /// same method present multiple times in same class is known as method overloading
		 						  // three types 1)no.of para 2) type of para  3) order of para
		 // In Method overridding different classes same methid present machha
	     // method overidding means parent class lo vunna method ni overrride chestudi  and child class lo vunna method ni access cheskuntuntundi
		 							
	@Override
	void dis() { 
		System.out.println(1);
	}
	
//	 void dis(int a) {
//			System.out.println(2);
//		}
//	 void dis(String name,int value) {
//			System.out.println(name +" roll no is: " + value);
//		}
}

public class Inheritance {
	public static void main(String args[]) {
		shop obj = new shop();
		
		obj.dis();
//		obj.dis(1);
//		obj.dis("Ajay",68);
	}

}
