package com.khelkar.sunil.string;

import java.util.Arrays;

public class LongestDistinctSubString2 {

	public static void main(String[] args) {
		int d = 97;
		            //0123456789012345  
		String str = "aaaabncdjaabcdeaaaaa";
		int len = str.length();
		int arr[] = new int[255];
		Arrays.fill(arr, -1);
		int start = 0, maxLen=0, res=0, temp =0 ;
		
		
		for (int j=0; j<len; j++) {
			if (temp < arr[str.charAt(j)]+1) {
				temp = arr[str.charAt(j)] + 1;
				//start = temp;
			}
			//temp = Math.max(start, arr[str.charAt(j)] +1);
			maxLen = j - temp + 1;
			if (res < maxLen) {
				res = maxLen;
				start = j - maxLen +1 ;
			}
			//res = Math.max(res, maxLen);
			arr[str.charAt(j)] = j;
			
			
		}
		System.out.println("location start = " + start + " End = " + (start + res -1));
		System.out.println(res);
		
	}
	
}
