package com.khelkar.sunil.recursion;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {10,20,15,5};
		int sum = 15;
		int curr = arr.length;
		//	System.out.println(countSubset(arr, curr, sum));

		 System.out.println(countSubsetB(arr, 0, sum));
	}

	public static int countSubset(int[] arr, int curr, int sum) {
		if (curr == 0) {
			return (sum == 0) ? 1 : 0;
		}
		if (sum < 0) return 0;
		System.out.println(curr + "sum remaining" + sum);
		return countSubset(arr, curr-1, sum - arr[curr-1]) + countSubset(arr, curr-1, sum);
	}
	
	public static int countSubsetB(int[] arr, int curr, int sum) {
		//System.out.println("curr " + curr + "sum " + sum);
		if (curr == arr.length) {
			return (sum == 0) ? 1 : 0;
		}
		if (sum < 0) return 0;
		System.out.println(curr + "sum remaining" + sum);
		return countSubsetB(arr, curr+1, sum - arr[curr]) + countSubsetB(arr, curr+1, sum);
	}
}
