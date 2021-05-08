package com.khelkar.sunil.string;

import java.util.Arrays;

public class StringMinimumMatchWindow {

	public static void main(String[] args) {
		String str = "dbaecbbabdcaafbddcabgba"; // total 23 characters
		String pat = "abbcdc"; //| a=1, b= 2, c= 2, d=1
		
		int mct = 0; // current match count
		int dmct = pat.length(); // desired match count
		
		int[] strArr = new int[255];
		int[] patArr = new int[255];
		//Arrays.fill(patArr, -1);
		String result = "";
		int resultLen = Integer.MAX_VALUE;
		
		for (int i=0;  i< pat.length(); i++ ) {
			patArr[pat.charAt(i)]++;
		} // now I have frequency of all the pattern string
		
		int i= -1, j=-1;
		
		while (true) {
			System.out.println("Match count before acquire : " + mct);

			boolean flag = true, flag2= true;
			// acquiring new characters
			while ( i < str.length()-1 && mct < dmct) {
				i++;
				strArr[str.charAt(i)]++;
				if (strArr[str.charAt(i)] <= patArr[str.charAt(i)]) {
					mct++;
				}
				flag = false;
			}
			System.out.println("Match count after acquire : " + mct);
			System.out.println(printAbcdFreq(strArr));
			// store result and release the extra characters
			
			
			while (j < i && dmct == mct) { // j cannot cross i and once we got the dmct reducing we should continue adding more
				j++;
				if (i-j +1 < resultLen) {
					result = str.substring(j, i+1);
					resultLen = result.length();
					System.out.println(result);
				}
				
				strArr[str.charAt(j)]--; // it would be atleast 1 as we are traversing the same character again
				if (strArr[str.charAt(j)] < patArr[str.charAt(j)]) {
					mct--;
				}
				flag2 = false;
			}
			
			System.out.println(printAbcdFreq(strArr));
			System.out.println("one cycle");
			if (flag && flag2 ) {
				break;
			}
		} // End of outermost While loop.
		
		System.out.println(result);
	}
	
	public static String printAbcdFreq(int[] arr) {
		
		String res= "";
		for (int i=97; i< 105; i++) {
		  res +=  arr[i] + ", ";	
		}
		
		return res;
	}
	
}
