package com.khelkar.sunil.arrays;

public class KadaneAlgorithmForMaxSubarraySum {
	
	public static void main(String[] args) {
		
		// Kadane Algorithm gives us the Max sum of subarray of the given array i.e. the subarray which has highest sum among all subarray 
		// possible. A subarray is always contingous, point to note.
		// max subarray possible N * (N+1) /2 
		
		int[] arr = {2,3,-8,7,-1,2,3 };
		int len = arr.length;
		
		int overallMax = arr[0];
		int currentMax = arr[0];
		
		for (int i=1; i < len; i++) {
			if (currentMax > -1) {
				currentMax += arr[i];
			} else {
				currentMax = arr[i];
			}
			
			if (overallMax < currentMax) {
				overallMax = currentMax;
			}
		}
		
		System.out.println(overallMax);
	}

}
