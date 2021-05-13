package com.khelkar.sunil.mathmatics;

import java.util.ArrayList;

public class AllPrimeFactorsOfN {

	public static void main(String[] args) {
		int n = 13;
		// now we know that any number factors occur in pair
		// so x *y = n and lets say x <= y then we can write as x*x <= y
		// this means that x <= square root of y  
		// what does this essentially means that the, we just need to find the number upto square of given number 
		// this way we are reducing our running time 
		ArrayList<Integer> prime = getAllPrimeUptoN(n);
		boolean isOneElmPrinted = false;
		for (int i : prime) {
			while (n % i == 0) {
				System.out.println(i);
				isOneElmPrinted = true;
				n /= i;
			}
		}
		
		if (isOneElmPrinted == false) {
			System.out.println(n);
		}
		
	}
	
	public static ArrayList<Integer> getAllPrimeUptoN(int n) {
		ArrayList<Integer>  list= new ArrayList<>();
		//list.add(2);
		boolean[] arr = new boolean[n];
		for (int i=2; i*i <=n; i++) {
			if (arr[i] == false) {
				list.add(i);
				for (int j=i*i; j <n; j+=i ) {
					arr[j] = true;
				}
			}
		}
		return list;
	}
	
}
