package com.khelkar.sunil.recursion;

public class subset2 {

	
	public static void main(String[] args) {
		
		int arr[] = {10,4,2,6,7};
		int sum = 25;
		
		System.out.println(subset(arr, sum, 0));
		
	}
	
	public static int subset(int[] arr, int sum, int n) {
		
		if (sum == 0) {
			return 1;
		} else if (sum < 0 || n == arr.length) {
			return 0;
		}
		
		return subset(arr, sum, n+1) + subset(arr, sum- arr[n], n+1);
		
		
	}
	
}
