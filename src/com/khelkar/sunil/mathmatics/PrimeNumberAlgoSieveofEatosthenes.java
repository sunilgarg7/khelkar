package com.khelkar.sunil.mathmatics;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberAlgoSieveofEatosthenes {

	public static void main(String[] args) {
		
		int n = 10000;  // get input from user 
		Boolean[] arr = new Boolean[n + 1];
		Arrays.fill(arr, false);
		
		
		for (int i =2; i * i <= n; i++) { // if we say i*i here then we wont be able to print all the  values.
			if (arr[i] == false) {
				System.out.print(i + ", ");
			} else {
				continue;
			}
			
			for (int j=i*i; j<=n; j += i) {
				arr[j] = true;
			}
		}
		
		System.out.println();
		System.out.println(
				Arrays.stream(arr).filter(x -> x == false).count()
				);
		
	}
	
	
}
