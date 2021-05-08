package com.khelkar.sunil.DynamicProgramming;

import java.util.HashSet;

public class LIS {
	public static void main(String[] args) {
		String str  = "adc";
		//str.toUpperCase();
		
		int[] arr  = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		int n= arr.length; //  arr[] = {1, 9, 3, 10, 4, 20, 2}
		HashSet<Integer> hm = new HashSet<Integer>();

		for (int i=0; i<n; i++) {
			hm.add(arr[i]);
		}

		int maxLen = 0;

		for (int i=0; i<n; i++) {
		int lmax =0 ;
		int val = arr[i];
		if ( hm.contains(val-1)) {
				continue; // then we dont need to start from here
		} else {
			lmax++;
		 	while(true) {
		 		val = val+1;
				if (hm.contains(val)) {
					lmax++;
				} else {
					if (lmax > maxLen) {
						maxLen = lmax;	
						}
					break;
					}
		 		}
			}

		}
		
		System.out.println(maxLen);

	}
}
