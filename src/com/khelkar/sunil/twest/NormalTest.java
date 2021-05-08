package com.khelkar.sunil.twest;


public class NormalTest {

	public static void main(String[] args) {
		String str = "0abcdefgh";
		int index = 1;
		char c = ' '; // we cannot define blank 
		str = str.replace(str.charAt(index), ' ');
		
		System.out.println(str);
	}
}
