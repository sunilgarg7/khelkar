package com.khelkar.sunil.arrays;

import java.util.Arrays;

public class PrefixSumWithPrefixRangeCountWithN_Queries {
	
	// Better go at this link to understand it - https://www.youtube.com/watch?v=f43qOr8eTlU

	public static void main(String[] args) {
		
		// Question based on Range Queries and Prefix SUM and Prefix COUNT
		// you will be given with an array and Q - signifies number of queries with a number m 
		// 			m signifies that you need to have maximum of this number to be added in your sub-queries 
		// example - 10 3 2
		//			  2 6
		//			  4 9 
		// 			  1 4
		// we have to maximize how many times the m would could come if we exactly uses q-1 queries..
		// i.e. we have to drop 1 query and give the max times the m would appear in the 
		// rest queries in the prefix sum array here known as query array
		
	
		int n = 10;
		// indexing is 1 based so create an array with n+1 size
		n += 1 + 1;
		// or if array is already defined then use
		// System.arraycopy(arr, 0, newArr, 1, n);

		int [] arr = new int [n];
		int q = 3;
		int m = 2;
				
		int left[] = {2, 4, 1};
		int right[] = {6, 9, 4};
		
		// first process the queries in O(1) time
		int[] queries = new int[n];
		for (int i=0; i < q; i++) {
			queries[left[i]]++;
//			if (right[i]+1 < n) {  /* We saved this extra if condition by incrementing our array length by 1  */
				queries[right[i] + 1]--; // processing end of the queries, +1 to index because we want to include the last end also 
//			}
		}
		
		// Now Pre-process this queries array and calculate the sum...
		// Normally pre-processed array is all we needed but in this case we need a Pre-fix count of m and m+1
		// i.e. how many times we are seeing m and m+1 into this prefix sum array
		int [] prefixCountForM = new int [n];
		int [] prefixCountForM1 =  new int [n]; // represents prefix count of m+1

/**
 * We got saved from this also as we have used an array whose 		 
		
		prefixCountForM[0] = queries[0] == m ? 1 :0;
		prefixCountForM1[0] = queries[0] == m+1 ? 1 :0;
		
**/		
		for (int i =1 ; i < n; i++) {
			int count = 0, count1 =0 ;
			queries[i] += queries[i-1];
			
			if (queries[i] == m) {
				count++;
			} else if (queries[i] == m+1) {
				count1++;
			}
			
			prefixCountForM[i] += prefixCountForM[i-1] + count;
			prefixCountForM1[i] += prefixCountForM1[i-1] + count1;
			
		}
		
		System.out.println(Arrays.toString(queries));
		System.out.println(Arrays.toString(prefixCountForM));
		System.out.println(Arrays.toString(prefixCountForM1));
		
		int maxCountOfM = prefixCountForM[prefixCountForM.length -1];

		// now we have pre-processed queries, we have prefix sum, we have prefix count of m and also prefix count of m-1
		// Now we can ignore all queries 1 by 1 and see how many m are left after ignoring each one and the max we get will return
		int maxResult = 0;
		for (int i=0 ; i < q; i++) {
			int start = left[i];
			int end = right[i];
			
			int result  = maxCountOfM - (prefixCountForM[end] - prefixCountForM[start -1]) /* the loss */ 
									  + (prefixCountForM1[end] - prefixCountForM1[start -1 ]) /* the profit */ ;
			if (result > maxResult) {
				maxResult = result;
			}
		}
		
		System.out.println(maxResult);
		
		
	}

}
