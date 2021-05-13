package com.khelkar.sunil.string.competitive;

import com.khelkar.sunil.tool.Tools;

public class StringMinDeleteToMakeEqual {

	public static void main(String[] args) {
		
		// answer should be 6
		String s1 = ":poab121cdef21"; // 13
		String s2 = ":xyabhddeudfio"; // 13
		int len1 = s1.length();
		int len2 = s2.length();
		int[][]  dp = new int[len1 +1 ][len2 +1];
		
		
		// will be using LongestCommonSubsequence first then with other opposite alternative solution
		for (int i=0; i<=len1; i++) {
			for (int j=0; j<=len2; j++) {
				if (i==0 || j==0) {
					dp[i][j] = 0;
				} else if (s1.charAt(i-1) == s2.charAt(j-1)){
					dp[i][j] = 1 + dp[i-1][j-1];
				} else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		int commonSubsequenceLength = dp[len1 - 1][len2 - 1];
		System.out.println("Characters that are equal in given Strings :" + commonSubsequenceLength);
		System.out.println( len1 + len2 - (2* commonSubsequenceLength) );
		Tools.display(dp);
		//-------------------------------------------------------------------------------------------------
		
		// using 2nd alternative approach which is just opposite to it..
		// here we will be directly computing the number of characters needed for deletion.
		
		for (int i=0; i <= s1.length(); i++) {
			for (int j=0; j<= s2.length(); j++) {
				if (i==0 && j==0) {
					dp[0][0] = 0;
				} else if (i==0) {
					dp[i][j] = j;
				} else if (j ==0) {
					dp[i][j] = i;
				} else {
					if (s1.charAt(i -1) == s2.charAt(j-1)) {
						dp[i][j] = dp[i-1][j-1];
					} else {
						dp[i][j] = 1 + Math.min(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
		}
		Tools.display(dp);
		
		System.out.println("Characters that are equal in given Strings (from 2nd approach) :" + dp[s1.length()][s2.length()]);

		
	}
	
}
