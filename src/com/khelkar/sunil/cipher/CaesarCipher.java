package com.khelkar.sunil.cipher;

import java.util.Arrays;

public class CaesarCipher {

	// A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
	// V W X Y Z A B C D E F G H I J K L M N O P Q R S T U
	public static void main(String[] args) {
		String src = "BJJYGPXFDITJPMZSYH";
		String tar = "GOODLUCKINYOUREXAM";
	
		char[] source = src.toCharArray();
		char[] target = tar.toCharArray();
		int[] srcF = new int[255];
		int[] tarF = new int[255];
		int srcMax=0, tarMax=0;
		char maxSrcChar = 0, maxTarChar = 0;
 		
		// get the max frequency character from both the strings and get the shift distance between both of them
		
		for (int i=0; i< src.length(); i++) { // length of source is equal to the length of target{ or it cud be different ??}
			srcF[source[i] - 'A']++;
			tarF[target[i] - 'A']++;
			
			if (srcMax < srcF[source[i] - 'A']) {
				srcMax = srcF[source[i] - 'A'];
				maxSrcChar = (char)(source[i] - 'A');
			}
			
			if (tarMax < tarF[target[i] - 'A']) {
				tarMax = tarF[target[i] - 'A'];
				maxTarChar = (char)(target[i] - 'A');
			}
		}
		
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target));
		
		System.out.println(Arrays.toString(srcF));
		System.out.println(Arrays.toString(tarF));
		
		System.out.println("diff is " + (maxTarChar - maxSrcChar));
	
		
		
		
		
//		source = "Y";
//		target = "A";
		
		// GET THE DIFFERENCE IN SOURCE AND TARGET FIRST WORD
		
/**		int diff = target.charAt(0) - source.charAt(0);
		if (diff < 0) {
			diff = Math.abs(diff);
		}
		System.out.println(diff);
		char[] tar = new char[source.length()];
		int i=0;
		for (char c: source.toCharArray()) {
			tar[i] = (char)(c + diff);
			if (tar[i] > 'Z') {
				tar[i] -= 'Z' + 'A' -1;
			}
			i++;
		}
		
		System.out.println(Arrays.toString(tar)); **/
		
	}
	
}
