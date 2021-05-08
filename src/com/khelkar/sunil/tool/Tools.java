package com.khelkar.sunil.tool;

public class Tools {

	public static void display(int[][] dp) {
		String str = "";
		int n = dp.length; // it will be square
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
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

}
