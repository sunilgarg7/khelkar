package com.khelkar.sunil.DynamicProgramming;

public class CoinChangeProblem {

	public static void main(String[] args) {
		int amt = 7;
		int[] coins = {1,2,3,5,6};
		coinChange(coins, 0, amt , "", 0);
	}
	
	
	public static void main1(String[] args) {
		
		int amt = 7;
		int[] coins = {2,3,5,6};
		int[] dp = new int[amt + 1];
		dp[0] = 1;
		
		for (int coin : coins) {
			for (int i=coin; i <= amt; i++) {
				dp[i] += dp[i-coin];
			}
		}
		System.out.println(dp[amt]);

	}
	
	
	/*
	 * public int coinChangePermutation(int[] coins, int valRemaining) { 
	 * if (valRemaining == 0) { return 0; } }
	 * 
	 * for (int i=1; i<n; i++ ){
	 * 
	 * 	for (int coin : coins) {
	 * 	if (
	 * 		dp[i] = dp[i-coin];
	 * }
	 * 
	 * 
	 * 
	 */
	
	public static void coinChange(int [] coinArr, int amountPaid, int totalAmount, String asf, int curr) {

		if (amountPaid == totalAmount) {
			System.out.println(asf);
			return;
		} else if (amountPaid > totalAmount || curr == coinArr.length) {
			return;
		}
		
		coinChange(coinArr, amountPaid, totalAmount, asf, curr + 1);
		coinChange(coinArr, amountPaid + coinArr[curr], totalAmount, asf + coinArr[curr] + "+" , curr + 1);
		
	}
	
	
}
