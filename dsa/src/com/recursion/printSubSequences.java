package com.recursion;
import java.util.*;


// count how many sub seq haveing sum == k

public class printSubSequences {
	static int printF(int idx,int s,int arr[],int sum) {
		// base case
		
		if(idx == arr.length) {
			if(sum == s) {
				return 1;
				
			}
			return 0;
			
		}
		
		int l = printF(idx+1,s += arr[idx],arr,sum);
		
		int r = printF(idx+1,s -= arr[idx],arr,sum);
		return l+r;
	}
	public static void main(String args[]) {
		int arr[] = {1,2,1};
		int k = 2;
		
		int count = printF(0,0,arr,k);
		System.out.println(count);
		
	}
}













// print only one sub sequence


//public class printSubSequences {
//	static boolean printF(int idx,int s,int arr[],List<Integer>ds,int sum) {
//		// base case
//		
//		// condition satisfied
//		if(idx == arr.length) {
//			if(sum == s) {
//				System.out.println(ds);
//				return true;
//			}
//			// condition not satisfied
//			else {
//			return false;
//		}
//			}
//		ds.add(arr[idx]);  
//		if(printF(idx+1,s+arr[idx],arr,ds,sum) == true)return true;
//		
//		ds.remove(ds.size()-1);
//		if(printF(idx+1,s,arr,ds,sum) == true)return true;
//		return false;
//	}
//	public static void main(String args[]) {
//		int arr[] = {1,2,1};
//		int k = 2;
//		List<Integer> ds = new ArrayList<>();
//		printF(0,0,arr,ds,k);
//		
//	}
//}
//





// print sub - sequences whos sum ====== k

//public class printSubSequences {
//	static void printF(int idx,int s,int arr[],List<Integer>ds,int sum) {
//		// base case
//		
//		if(idx == arr.length) {
//			if(sum == s) {
//				System.out.println(ds);
//				
//			}
//			return;
//			
//		}
//		ds.add(arr[idx]);
//		//s+=arr[idx];
//		printF(idx+1,s += arr[idx],arr,ds,sum);
//		
//		ds.remove(ds.size()-1);
//		//s -= arr[idx];
//		printF(idx+1,s -= arr[idx],arr,ds,sum);
//	}
//	public static void main(String args[]) {
//		int arr[] = {1,2,1};
//		int k = 2;
//		List<Integer> ds = new ArrayList<>();
//		printF(0,0,arr,ds,k);
//		
//	}
//}
//









