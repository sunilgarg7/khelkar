package com.khelkar.sunil.arrays;

public class LeadersInArray {
	public static void main(String[] args) {
		
		// what does leader mean in an Array
		// A leader is an index or element who does have any bigger element than him on its right side or on higher index
		// 
		// to solve this problem in Linear time, we have to traverse the array from the right side and keep note on the biggest element
		// we have found till now
		
		
		int [] arr = {7,10,4,10,6,5,3};
		int len = arr.length -1 ;
		
		int temp= 0; // if our array does not contains negative, otherwise keep it as Integer.Min
		while (len >= 0 ) {
			if (arr[len] > temp) {
				// this means this is the leader
				System.out.println(arr[len]);
				temp = arr[len];
			}
			len--;
		}
		
		System.out.println("khatam"); // as it could have a leader at all, so printing this ;-)
	}

}
