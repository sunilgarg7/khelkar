package com.khelkar.sunil.mathmatics;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 123321;
		int result = 0 ;
		int temp = num;
		
		while (temp > 0) {
			int digit = temp%10;
			result = result * 10 + digit;
			temp /= 10;
		}
		
		System.out.println(result == num);
	}
	
	
}
