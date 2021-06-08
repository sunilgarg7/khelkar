package com.khelkar.sunil.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class IntervalMerge {
	
	public static void main(String[] args) {
		// 		Input: [[10, 12], [2, 6], [4, 8], [18, 20]]
		// 				[5,9] [5,6]
		//		Output: [[2, 8], [10, 12], [18, 20]]
		
		int[][] input = {{10,12}, {2,6}, {4,8}, {18,20}};
		
		
		
	System.out.println(	Arrays.toString( mergeInput(input) ) );
		
		
	}

	private static int[][] mergeInput(int[][] input) {
		
		Arrays.sort(input, (a,b) -> Integer.compare(a[0], b[0])); // nlogn
		LinkedList<int[]> list = new LinkedList<>();
		
		for (int[] in : input) {
			if (list.isEmpty()) {
				list.add(in);
			} else {
				int[] last = list.getLast();
				if (last[1] >=  in[0]) {
					last[1] = Math.max(last[1], in[1]);
				} else {
					list.add(in);
				}
			}
		}
		
		return list.toArray(new int[list.size()][]);
	}

}
