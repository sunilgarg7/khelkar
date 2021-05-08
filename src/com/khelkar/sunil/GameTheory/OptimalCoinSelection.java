package com.khelkar.sunil.GameTheory;

import com.khelkar.sunil.tool.Tools;

public class OptimalCoinSelection {

	// Motive - To learn more about Game Theory.
	// Game theory is the Most seeked question in Big Companies FAANG types
	// It test how much the person knows about DP and Optimization and how well he understands the relation between them.
	
	public static void main(String[] args) {
		// Driver Program - offcourse main hai toh driver hi hoga ;-)
		
		// we will be given an Input of an Array which has some non-negative values of coins and
		// we have to choose the maximum sum or sometimes minimum sum also. 
		// for this question we have to maximize our sum.
		
		int[] arr = {10,20,2,25,34,5,7,8,9}; 
		// how choosing will work, if we go by greedy approach then we try to maximize by only based on current choices only which will be 10,9 i.e.
		// choosing from two ends { thats what the question says, is it ?? Yes it is.}
		// so by greedy approach we will chose 10 from options {10, 9} which will give option of 20 and 8 to choose from, making us loose directly by 10 in a 
		// choice, so we must play smart here.
		
		int len = arr.length;
		int [][] dp = new int[len][len];
		
		// Using gap strategy, if u dont know about this strategy then I will highly recommend you to leave every thing and learn about this.
		// TODO some more notes about gap strategy.
		
		for (int gap = 0; gap < len; gap++ ) { // arr = {10,20,2,25,34,5,7,8,9}; 
			for (int i=0, j= gap; j< len; i++, j++) {
				if (gap == 0) {
					dp[i][j] = arr[i];
				} else if (gap == 1) { 
					dp[i][j] = Math.max(arr[i], arr[j]);
				} else {
					// Learn from here : https://www.youtube.com/watch?v=ww4V7vRIzSk
					int a = arr[i] + Math.min(dp[i+2][j], dp[i+1][j-1]);
					int b = arr[j] + Math.min(dp[i+1][j-1], dp[i][j-2]);
					dp[i][j] = Math.max(a, b);
				}
			}
			
		} // End of Gap for loop
		
		Tools.display(dp);
		
		
	}
	
}
