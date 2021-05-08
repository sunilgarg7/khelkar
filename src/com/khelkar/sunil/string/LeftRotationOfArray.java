package com.khelkar.sunil.string;

import java.util.Arrays;

public class LeftRotationOfArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int rotation  = 5 ;
		
		reverse(arr, 0, rotation-1);
		reverse(arr, rotation, arr.length-1);
		reverse(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void reverse(int[] arr, int start, int end) {
		int temp ;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr [end];
			arr[end] = temp;
			start++;
			end--;
			System.out.println(Arrays.toString(arr));

		}
		System.out.println();
		
	}
	
	
}
