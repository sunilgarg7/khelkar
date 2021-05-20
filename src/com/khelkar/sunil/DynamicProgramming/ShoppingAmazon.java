package com.khelkar.sunil.DynamicProgramming;

import java.util.Arrays;

public class ShoppingAmazon {

	// Very Important question to understand, how we can reduce the total number of iteration when brute force is the only solution
	// With Array remember your two weapon, either Sort them or use the in-place replace
	public static void main(String[] args) {
		
		int budget = 1000;
		
		int[] jeans= {500,30};
		int[] shoes= {100,150,200};
		int [] skirt= {300, 400, 500};
		int[] top = {78,989,234};
		
		// sort these arrays before passing to function
		Arrays.sort(jeans);
		Arrays.sort(shoes);
		Arrays.sort(skirt);
		Arrays.sort(top);
		// why we need sorting ??
		// In constraints it is given that these items price array can have max 1000 elements and price can be of 10 power 9 
		// by sorting these arrays we can easily return from a point in our recursion saying that no more possible case can be formed as the current element is smallest than 
		// the other rest elements as we have already sorted array.
		
		int res =shop(jeans, shoes, skirt, top, budget, 1);
		System.out.println(res);
	}
	
	
	public static int shop(int[] jeans, int[] shoes, int [] skirt, int[] top, int budget,int type) {
		
		if (budget < 0) {
			return 0;
			// short circuiting as it might happen that after choosing 1 element we get price negative.
		}
		
		if (type > 4 ) {
				return 1; // we have bought all things, so this is one way for sure.
		}
		
		int[] items = null;
		switch (type) {
		case 1:
			items = shoes;
			break;
		case 2:
			items = skirt;
			break;
		case 3:
			items = top;
			break;
		case 4:
			items = jeans;
			break;
			default:
				break;
		}
		
		
		int count = 0;
		int temp = 0;
		for (int i=0; i<items.length; i++) {
			
			temp = shop(jeans, shoes, skirt, top, budget- items[i], type + 1);
			
			if (temp == 0) {
				// by sorting these arrays we can easily return from a point in our recursion saying that no more possible case can be formed as the current element is smallest than 
				// the other rest elements as we have already sorted array.
				// as per above comments no further element can give us any more permutation. so short-circuit here ;-)
				// this reduces our overall run-time
				return count;
			}
			
			count += temp;
			
		}
		
		return count;
		
	}
	
}
