 package com.khelkar.sunil.mathmatics;

import java.util.Arrays;

public class PrimeUptoN {

	public static void main(String[] args) {
		
		int n = 10000;
		boolean[] arr = new boolean[n+1];
		Arrays.fill(arr, true);
		int count =0 ;
		for (int i = 2; i <= n; i++) {
			
			if (arr[i] == true) {
				System.out.println(i);
				for (int j = i*i; j <= n; j = j
						+i) {
					arr[j] = false;
					count++;
				}
			}
			
		}
		
		System.out.println("count of loop " + count);
	}
	
}
