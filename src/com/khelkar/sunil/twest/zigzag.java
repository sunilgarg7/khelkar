package com.khelkar.sunil.twest;

import com.khelkar.sunil.tool.Tools;

public class zigzag {

	
	public static void main(String[] args) {
		
		String str= "abccbc";
		
		
		int n = str.length();
		int dp[][] = new int[n] [n];
		
		// gap startergy when both strings are same.
		for (int gap=0; gap<n; gap++) {
			for (int i =0, j= gap; j<n; i++, j++) {
				if (gap == 0) {
					dp[i][j] = 1;
 				} else if (gap == 1 ) {
 					if (str.charAt(i) == str.charAt(j)) {
 						dp[i][j] = 3;
 					} else {
 						dp[i][j] = 2;
 					}
 				} else {
 					if (str.charAt(i) == str.charAt(j)) {
 						dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1;
 					} else {
 						dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
 					}
 				}
			}
			//System.out.println();
		}
		Tools.display(dp);
		System.out.println("----------------------------------");
		printPrefix(str);
	}
	
	
	public static void printPrefix(String str) {
	int n = str.length();
	boolean dp1[][] = new boolean[n] [n];
		
		for (int gap=0; gap<n; gap++) {
			for (int i =0, j= gap; j<n; i++, j++) {
				if (gap == 0) {
					dp1[i][j] = true;
 				} else if (gap == 1 ) {
 					if (str.charAt(i) == str.charAt(j)) {
 						dp1[i][j] = true;
 					} else {
 						dp1[i][j] = false;
 					}
 				} else {
 					if (str.charAt(i) == str.charAt(j)) {
 						dp1[i][j] = dp1[i+1][j-1];
 					} else {
 						dp1[i][j] = false;
 					}
 				}
			}
			//System.out.println();
		}
		Tools.display(dp1);
	}
	
		
}
