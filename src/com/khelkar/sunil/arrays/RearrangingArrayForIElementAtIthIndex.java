package com.khelkar.sunil.arrays;

import java.util.Arrays;

public class RearrangingArrayForIElementAtIthIndex {

	//Rearrange an array such that arr[i] = i
	public static void main(String[] args) {
		int [] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		
		for (int i= 0; i < arr.length; ) {
			if (arr[i] != -1 &&  arr[i] != i) {
				int temp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
		}
		
		System.out.println(Arrays.toString(arr));

		int i=0;
		while (i < arr.length) {
			if (arr[i] != -1 && arr[i] != i) {
				int temp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = temp;
			} else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	
}
