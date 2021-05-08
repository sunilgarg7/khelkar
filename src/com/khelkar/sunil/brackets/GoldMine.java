package com.khelkar.sunil.brackets;


import com.khelkar.sunil.tool.Tools;

public class GoldMine {
 // gold mine in a increasing row order where it can pick only 1 in a column 
	
	public static void main(String[] args) {
		int[][] src= { {4, 5, 7, 98, 9}, 
					   {1, 4, 6,  1, 2},
					   {3, 6, 1,  2, 1},
					   {11,23,33, 1, 21},
					   {54,21, 3, 2, 1 }};
		int row = src.length ;
		int cols = src[0].length;
		
		int [][] dp = new int[row][cols];
		
		for (int i=0; i< row; i++) {
			dp[i][cols-1] = src[i][cols-1];
		}
		int max =0 ;
		for (int j=cols-2; j >= 0; j--) {
			for (int i=0; i < row; i++) {
				if (i == 0) { // if row is zero then we need to fill differently
					dp[i][j] = src[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
				} else if (i == row-1) {
					// then also we need to fill row differently
					dp[i][j] = src[i][j] + Math.max(dp[i-1][j+1], dp[i][j+1]);
				} else {
					dp[i][j] = src[i][j] + Math.max(dp[i+1][j+1], Math.max(dp[i-1][j+1], dp[i][j+1]));
				}
				if (j ==0) {
					if (max < dp[i][j]) {
						max = dp[i][j];
					}
				}
			}
			
		}

		Tools.display(dp);
		System.out.println(max);
//		fillGoldMineDP(src, dp, row);

		//		Tools.display(dp);
		
		}

	private static void fillGoldMineDP(int[][] src, int[][] dp, int row) {
		if (row == src.length -2) { // already filled first one.
			return;
		}
		
		for (int i=0; i< src.length; i++) {
			
		}
	}
	
	}
	
	
