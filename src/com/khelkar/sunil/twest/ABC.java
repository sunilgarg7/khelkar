package com.khelkar.sunil.twest;

import java.util.Arrays;

public class ABC {
	
	public static void main(String[] args) {
		
		int[] ab = {1,2,1,2,1,2,2,1};
		boolean isAcceptable = true;
		Arrays.sort(ab);
		
		System.out.println(Arrays.toString(ab));
		
		for (int i=0; i < ab.length; i = i+2) {
			if (ab[i] != ab [i+1]) {
				isAcceptable = false;
				break;
			}
			
		}
		
		if (isAcceptable == false) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
	}

}
