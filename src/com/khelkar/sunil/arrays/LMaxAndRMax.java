package com.khelkar.sunil.arrays;

import java.util.Arrays;

public class LMaxAndRMax {

	public static void main(String[] args) {
		
		int[] arr = {5,0,6,2,3};
		int len = arr.length;
		// we have to compute the left max subarray for each index
		int leftMax = arr[0];
		int [] lmax = new int[len];
		lmax[0] = leftMax;
		
		for (int i=1; i<len; i++) {
			if (leftMax < arr[i]) {
				leftMax = arr[i];
			}
			lmax[i] = leftMax;
		}
		System.out.println(Arrays.toString(lmax));
		
		// we have to compute the right max subarray for each index
		int[] rmax = new int[len];
		rmax[len-1] = arr[len-1];
		int rightMax = arr[len-1];
		for (int i=len-2; i >=0; i--) {
			if (rightMax < arr[i]) {
				rightMax = arr[i];
			}
			rmax[i] = rightMax;
		}
		
		System.out.println(Arrays.toString(rmax));
		

		// now above two array can be used to calculate the water fill in given array representing wall sizes
		int water = 0;
		for (int i=1; i < len -1; i++) { // len -1 because we dont need to include last value similar to first value
			water += Math.min(lmax[i], rmax[i]) - arr[i];
		}
		
		System.out.println("water in the well is " +  water);
	}
	
	
	
}
