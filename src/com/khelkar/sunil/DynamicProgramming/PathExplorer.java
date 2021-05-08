package com.khelkar.sunil.DynamicProgramming;

import com.khelkar.sunil.tool.Tools;

public class PathExplorer {
	public static void main(String[] args) {
		int[][] src= { 	{4,  5,   7, 98,  98,  9},
						{7,  3,  13,  8,  11, 21},
					 	{1,  4,   6,  1,  51,  2},
					 	{3,  6,   1,  2,  22,  1},
					 	{11, 23, 33,  1,  31, 61},
					 	{54, 21,  3,  2,   2,  1} };
	
		int rows = src.length;
		int cols = src[0].length;
		
		int [][] dp = new int[rows][cols];
		
		for (int row= rows-1; row>=0; row--) {
			for (int col= cols -1; col >=0; col--) {
				if (row == rows-1 && col == cols-1 ) {
					dp[row][col] = src[row][col];
				} else if (row == rows-1) {
					dp[row][col] = src[row][col] + dp[row][col+1];
				} else if (col == cols -1) {
					dp[row][col] = src[row][col] + dp[row+1][col];
				} else {
					dp[row][col] = src[row][col] + Math.min(dp[row][col+1], dp[row+1][col+1]);
				}
				
			}
		}
		
		Tools.display(dp);
	}
}
