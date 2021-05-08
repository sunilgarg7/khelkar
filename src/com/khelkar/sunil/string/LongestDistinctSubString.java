package com.khelkar.sunil.string;

import java.util.Arrays;

public class LongestDistinctSubString {

	public static void main(String[] args) {
		
		String str = "abadbbaazxcvbca";
		int len = str.length();
		int arr[] ;
	//	Arrays.fill(arr, -1);
		int start = 0, end=0, res=0, temp;
		
		
		for (int i=0; i<len; i++) {
			temp = 0;
			arr = new int[255];
			for (int j= i; j < len; j++) {
				if (arr[str.charAt(j)] != 0) {
					break;
				} else {
					arr[str.charAt(j)]++;
					temp++;
					if (temp > res) {
						res = temp;
						start = i+1; end = j+1;
					}
				}
			}
		}
		System.out.println("location start = " + start + " End = " + end);
		System.out.println(res);
		
	}
	
}
