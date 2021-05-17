package com.khelkar.sunil.string;

import com.khelkar.sunil.tool.Tools;

public class LCS {

	public static void main(String[] args) {
		String s1 = "abdcdef";
		String s2 = "abdde";
		int n = s1.length();
		int m = s2.length();
		int [][] dp = new int[n+1][m+1];
		
		for (int i=0; i<= n; i++) {
			for (int j=0; j<=m; j++) {
				if (i==0 || j==0) {
					dp[i][j] = 0;
				} else {
					char ch = s1.charAt(i-1);
					char ch2 = s2.charAt(j-1);
					if (ch == ch2) {
						dp[i][j] = dp[i-1][j-1] + 1;
					} else {
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
						dp[i][j] = dp[i+1][j+1] + 1;
					} else {
						dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
					}
				}
			}
		}
		Tools.display(dp);

		
	}
	
	
}
