package com.khelkar.sunil.DynamicProgramming;

import com.khelkar.sunil.tool.Tools;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		String s1 = "abcdefgh";  // 
		String s2 = "ndaefdxgch";
		// common subsequence would be adch
		int l1 = s1.length();
		int l2 = s2.length();
		
		int[][] dp = new int[l1 + 1][ l2 + 1]; // creating one size bigger array 
		
		for (int i= l1 -1; i >=0 ; i--) { 
// we are running one size lesser because the last one will have zeros anyway
			for (int j= l2 -1; j >=0 ; j--) {
				char c1 = s1.charAt(i);
				char c2 = s2.charAt(j);
				
				if (c1 == c2) {
					dp[i][j] = 1 + dp[i+1][j+1]; // look diagonally only if char matches
				} else {
// max of (c1, r2) & (c2, r1)
					dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]); 
				}
			}
		}
		Tools.display(dp);
	}
}