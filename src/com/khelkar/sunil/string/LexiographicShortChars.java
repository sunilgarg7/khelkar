package com.khelkar.sunil.string;

import java.util.Arrays;

public class LexiographicShortChars {

	public static void main(String[] args) {
		String str = "string";
		int[] arr = new int[255];
		
		for (int i=0; i< str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		
		for (int i=1; i < 255; i++) {
			arr[i] += arr[i-1];
		}
		
		Arrays.toString(arr);
		int count = 0 ;
		for (int i=0; i < str.length(); i++) {
			
			System.out.println(arr[str.charAt(i)] -1 );
//			count++;
	
			for (int j= str.charAt(i); j<255; j++) {
				arr[j] --;
			}
			 
		}
		
		
		
	}
	
}
