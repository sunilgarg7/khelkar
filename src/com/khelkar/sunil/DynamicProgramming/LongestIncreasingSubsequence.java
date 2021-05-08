package com.khelkar.sunil.DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr = {10,22,9,33,21,50,41,60,80,1}; // answer is 6
		// we have to get the Longest Increasing subsequence.
		int ovmax = 0; // overall max
		int[] dp = new int[arr.length];
		// dp[0] = 1; and ovmax = 1;  
		for (int i= 0; i< arr.length; i++) {
			int max = 0 ; // max for upto element i
			for (int j=0; j < i; j++) {
				if (arr[i] > arr[j] ) {
					// now we have found an smaller number in our given array, whose 
					// back we can append.
					if (max < dp[j]) {
						max = dp[j];
					}
				}
			}
			dp[i] = max + 1;
			if (ovmax < dp[i]) {
				ovmax = dp[i];
			}
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(ovmax); 
		
	}
	

	
}
