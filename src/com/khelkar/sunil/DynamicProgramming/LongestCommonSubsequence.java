package com.khelkar.sunil.DynamicProgramming;

import com.khelkar.sunil.tool.Tools;

public class LongestCommonSubsequence {
	
	public static void main(String[] args) {
		String s1 = "abdcdef";
		String s2 = "abdde";
		int n = s1.length();
		int m = s2.length();
		int [][] dp = new int[n+1][m+1];
		// So I am trying to get the Longest common subsequence in two ways 
		// 1st starting from the start of the strings and 
		// 2nd starting from the end of both strings.
		// by these two methods I am trying help the people out there that it does not matter from where you start, you just have 
		// to make little adjustments while writing, but as long as your algorithm is correct you dont need to worry from where to start.
		
		
		for (int i=0; i<= n; i++) {
			for (int j=0; j<=m; j++) {
				if (i==0 || j==0) {
					dp[i][j] = 0;
				} else {
					char ch = s1.charAt(i-1);
					char ch2 = s2.charAt(j-1);
					if (ch == ch2) {
						dp[i][j] = dp[i-1][j-1] + 1;// look diagonally only if char matches
					} else {
						// look diagonally only if char matches
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
		}
		
		Tools.display(dp);
		
		// from string end to string start
		for (int i=n; i>= 0; i--) {
			for (int j=m; j>=0; j--) {
				if (i==n || j==m) {
					dp[i][j] = 0;
				} else {
					char ch = s1.charAt(i);
					char ch2 = s2.charAt(j);
					if (ch == ch2) {
						dp[i][j] = dp[i+1][j+1] + 1;// look diagonally only if char matches
					} else {
						// look diagonally only if char matches
						dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
					}
				}
			}
		}
		Tools.display(dp);
	}
}