package com.khelkar.sunil.string;
import java.util.Arrays;

import com.khelkar.sunil.tool.Tools;

public class DistinctPalindromeSubsequence {

	
	public static void main(String[] args) {
	
		String str = "abacdaea";
		int len = str.length();
		int[][] dp = new int[len][len]; // this will be our memoized table
		
		// pre-processing the text
		int[] next = new int[len];
		int[] prev = new int[len];
		Arrays.fill(next, -1);
		Arrays.fill(prev, -1);
		
		int[] chars= new int[65];
		Arrays.fill(chars, -1);
		
		for (int i=0; i< len; i++){	
			int ch = str.charAt(i) - 'a';
			if (chars[ch] != -1) {
				prev[i] = chars[ch];
			}
			chars[ch] = i;
		}
		
		Arrays.fill(chars, -1);
		
		for (int i=len-1; i>= 0; i--){	
			int ch = str.charAt(i) - 'a';
			if (chars[ch] != -1) {
				next[i] = chars[ch];
			}
			chars[ch] = i;
		}
		
		// pre-processing done.. we need just next and prev only
		
		// Now using gap stratergy.
		
		for (int gap =0 ; gap< len; gap++) {
			for (int i=0, j=gap; j < len; i++, j++) {
				if (gap == 0) {
					dp[i][j] = 1;
				} else if (gap == 1) {
					dp[i][j] = 2;
				} else {
					int ch = str.charAt(i) - 'a';
					int chJ = str.charAt(j) - 'a';
					if (ch != chJ) {
						dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
					} else {
						int n = next[i];
						int p = prev[j];
						if (n > p) { // case when they are present at extreme ends like abdea
							dp[i][j] = (2* dp[i+1][j-1]) + 2;
 						} else if ( n == p) { // case when there are exactly one same character present in between like abbabba
 							dp[i][j] = (2* dp[i+1][j-1]) + 1;
 						} else {
 							dp[i][j] = (2* dp[i+1][j-1]) - dp[n+1][p-1];
 						}
					}
				} // if gap is not 0 or 1 
			}
		}
		Tools.display(dp);
	}
	
	
}
