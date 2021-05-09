package com.khelkar.sunil.tool;

import java.util.ArrayList;

public interface Tools {

	public static void display(int[][] dp) {
		String str = "\n";
		int n = dp.length; // it will be square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				str += String.format("%4d", dp[i][j]);
			}
			str += "\n";
		} // end of i loop

		System.out.println(str);
	}

	public static void display(boolean[][] dp) {
		String str = "";
		int n = dp.length; // it will be square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				str += String.format("%5d", dp[i][j]);
			}
			str += "\n";
		} // end of i loop

		System.out.println(str);
	}
	
	public static void fillArrayWithCollectorAndPrint(int[][] arr, ArrayList<Integer> collector) {
		int count=0;
		for (int i=0; i< arr.length; i++) {
			for (int j=0; j< arr[0].length; j++) {
				arr[i][j] = collector.get(count++); 
			}
		}
		Tools.display(arr);
	}

}
