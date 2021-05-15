package com.khelkar.sunil.greedy;

import java.util.Arrays;

public class GreedyWindowApprochForSolvingVeryLargeWindowQueries {
	public static void main(String[] args) {

		int[] arr = {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7};
		int[] copyarr = Arrays.copyOf(arr, arr.length);
		int[] left = {1, 3, 8, 4, 9, 12, 17, 20};
		int[] right = {3, 5 ,17, 7, 20, 25, 24, 30 };
		int[] query = { 20, 54, 23, 28, 5, 4, 6, 5};
		
		int Q = left.length;
		int N = arr.length;
		
		int[] qq =   new int[N];
		
		// ===================================== old way to verify just =================================
		for (int i= 0; i < Q; i++) {
			int l = left[i]-1;
			int r =  right[i];
			while (l < r) {
				copyarr[l] &= query[i];
				l++;
			}
		}
		System.out.println("old way solving we get :");
		System.out.println(Arrays.toString(copyarr));
		// END ===================================== old way to verify just =================================

		
		for (int i=0; i <Q; i++) {
			qq[left[i]- 1] += query[i];
			if (right[i] < arr.length)
				qq[right[i] ] += -query[i];
		}
		
		System.out.println(Arrays.toString(qq));
		
		// preprocess Query final array qq
		int sum =0;
		for (int i=0; i <qq.length; i++) {
			sum += qq[i];
			qq[i] = sum;
		}
		System.out.println(Arrays.toString(qq));

		for (int i=0; i < N; i++) {
			arr[i] &= qq[i];
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
