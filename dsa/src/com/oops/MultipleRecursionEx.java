package com.oops;

public class MultipleRecursionEx {

	static int fun(int n) {
		if(n <= 1) {
			return n;
		}
		int last = fun(n - 1);
		int first = fun(n - 2);
		return last + first;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(4));
		
	}

}
