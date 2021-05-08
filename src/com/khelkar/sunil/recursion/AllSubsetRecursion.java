package com.khelkar.sunil.recursion;

public class AllSubsetRecursion {

	
public static void main(String[] args) {
		
	 String str = "abcd";
		recurrsiveSubset(str, "" , 0);
	}


	public static void recurrsiveSubset(String str, String curr, int len){
		
		if (len == str.length()) {
			System.out.println(curr + " |");
			return;
		}
		
		recurrsiveSubset(str, curr + str.charAt(len) , len+1);
		recurrsiveSubset(str, curr, len+1);
	}
	
}
