package com.khelkar.sunil.DynamicProgramming;

import java.util.Arrays;

public class MaximumIncreasingSumOfSubarray {

	public static void main(String[] args) {
		int[] arr = {10,22,9,33,21,50,41,60,80,3};
		int len = arr.length;
		int[] dp = new int[len];
		dp[0] = arr[0];
		int ovmax = dp[0];
		
		for (int i=1; i< len; i++) {
			int max = 0;
			for (int j=0; j<i; j++) {
				if (arr[i] >= arr[j]) {
					if (max < dp[j]) {
						max = dp[j];
					}
				}
			}
			dp[i] = max + arr[i];
			if (ovmax < dp[i]) {
				ovmax = dp[i];
			}
		}
		
		System.out.println(Arrays.toString(dp));
	}
	
	
	
}
