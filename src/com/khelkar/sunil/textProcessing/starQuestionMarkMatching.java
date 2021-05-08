package com.khelkar.sunil.textProcessing;

public class starQuestionMarkMatching {

	public static void main(String[] args) {
		
		String str = "baaabab";
		String pat = "ba*a?b";
		
		boolean[][] dp = new boolean[pat.length() + 1][str.length() + 1];
		
		
		for (int i=dp.length -1 ; i >= 0; i--) {
			for (int j=dp[0].length -1; j >= 0 ; j--) {
				if (i == dp.length -1 && j == dp[0].length-1) {
					dp[i][j] = true;
				} else if (i == dp.length - 1 ) {
					dp[i][j] = false;
				} else if (j == dp[0].length-1) {
					if (pat.charAt(i) == '*') {
						dp[i][j] = dp[i+1][j];
					} else {
						dp[i][j] = false;
					}
				} else {
					if (pat.charAt(i) == '*') {
						dp[i][j] = dp[i+1][j] || dp[i][j+1];
					} else if (pat.charAt(i) == '?') {
						dp[i][j] = dp[i+1][j+1] || dp[i+1][j];
					} else if (pat.charAt(i) == str.charAt(j)) {
						dp[i][j] = dp[i+1][j+1];
					} else {
						dp[i][j] = false;
					}
				}
			}
		}
		
		int count=0;int j=0;
		for (int i=0; i < dp.length; i++) {
			if (i < dp.length -1)
			System.out.print(pat.charAt(i) + " ");
			for (j=0; j < dp[0].length; j++) {
				if (i ==0 && (j < dp[0].length -1)) {
					System.out.print(str.charAt(j) + " ");
					System.out.print(dp[i][j] + "  ");
				} else 
					System.out.print( "  " + dp[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println("result is: " + dp[0][0]);
		
	}
	
	
}
