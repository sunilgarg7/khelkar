package com.khelkar.sunil.arrays;

public class MaxDifferenceInBetweenTwoIndexInArray {
	
	public static void main(String[] args) {
		// the problem is to find the max difference between two indexes of array i & j such that i <j
		// this is classicly used in stock buying sell problem where only one transaction allowed.
		int [] arr = {2,3,10,6,4,8,1};
		int len = arr.length;
		
		int min = Integer.MAX_VALUE;
		int res = 0;
		
		for (int i=0; i <len; i++) {
			if (arr[i] < min) {
				min = arr[i];
				continue;
			}
			res = Math.max(res, arr[i] - min);
		}
		
		System.out.println(res);
		
	}

}
