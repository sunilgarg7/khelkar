package com.khelkar.sunil;

import java.util.Arrays;

// THE TOP MOST ASKED ALGORITHM -- DIRECTLY OR INDIRECTLY.

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
				//   0,1,2,3,4,5,6,7,8,9 10 11
 		int arr[] = {1,2,3,3,5,5,5,5,5,5,8,9};
		int n = 5;
		
		System.out.println(Arrays.binarySearch(arr, n));
		
		System.out.println(binarySearchToGetFirstOcurrance(arr, n));
	}

	private static int binarySearchToGetFirstOcurrance(int[] arr, int q) {
		int mid = 0;
		int start =0;
		int end = arr.length-1;
		
		int res = 0; //
		
		while (start <= end) {
			mid = (start + end) >>>1; // means diving by 2, just fancy way of writing it, u cn use divide by 2 also nothing much diff
			int currMidVal = arr[mid];
			if (currMidVal < q) {
				// that means our element is greater than sorted element, move right
				start = mid+1; // if u forgot +1 here or -1 down there, u will get stuck in infinite loop in starting 
			} else if (currMidVal > q){
				// move left, this also means that we are moving left in case we have a match,
				// depends on a case to case basis, lets write 1st for the case where we dont have duplicates
				end = mid-1;
			} else {
				res = mid;
				// when we got any currMidVal = to q 
				if (mid == 0 || arr[mid-1] < q) {
					return res;
				}
				else {
					// we need to move in left direction as we need to find first occurrence
					end= mid-1;
				}
			}
		}
		return - (mid +1); // return insertion point where we can insert this q or simple return -1 ;-)
	}
	
	private static int binarySearch(int[] arr, int n) {
		int mid = 0;
		int start =0;
		int end = arr.length-1;
		
		while (start <= end) {
			mid = (start + end) >>>1; // means diving by 2, just fancy way of writing it, u cn use divide by 2 also nothing much diff
		
			if (arr[mid] < n) {
				// that means our element is greater than sorted element, move right
				start = mid; // u can mark as mid + 1 as we have already compared mid, but nothing much big difference.
			} else if (arr[mid] > n)  {
				// move left, this also means that we are moving left in case we have a match,
				// depends on a case to case basis, lets write 1st for the case where we dont have duplicates
				end = mid;
			} else {
				// we found element, if there are more same elements then we must deploy different strategy 
				return mid;
			}
		}
		return mid;
	}

}
