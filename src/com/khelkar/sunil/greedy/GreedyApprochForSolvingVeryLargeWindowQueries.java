package com.khelkar.sunil.greedy;

import java.util.Arrays;
import java.util.ArrayList;

public class GreedyApprochForSolvingVeryLargeWindowQueries {
	public static int lastValue =Integer.MAX_VALUE;

	public static class calc{
		public ArrayList<Integer> list = new ArrayList<>();
		
		public calc() {}

		public int addAndGetResult(int newNumber) {
			list.add(newNumber);
			return lastValue &= newNumber;
		}
		
		public int add(int number, calc listOfNegativeList) {
			if (number >0) {
				list.add(number);
				lastValue &= number;
			}
			
			if (listOfNegativeList != null && listOfNegativeList.list.size() >0) {
				 // removing all the elements whose ends does not meet
				// recalculate
				return lastValue = getResult(listOfNegativeList.list);
			}
			 return lastValue;
		}
		
		public int getResult(ArrayList<Integer> removalList) {
			// list.removeAll(removalList); // we cannot do removeAll as it will remove multiple duplicates value also which is wrong
			for (Integer i : removalList) {
				list.remove(i);
			}
			
			return list.parallelStream().reduce(Integer.MAX_VALUE, (x,y) -> x&y); // Integer.MAX_VALUE because we are doing AND
		}
		
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		

		int[] arr = {7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7};
		int[] copyarr = Arrays.copyOf(arr, arr.length);
		//Arrays.fill(copyarr, Integer.MAX_VALUE);
		int[] leftIndexes =  {  1,  3,  8,  4,  9, 12, 17, 20 };
		int[] rightIndexes = {  3,  5 ,17,  7, 20, 25, 24, 30 };
		int[] queryValues =  { 20, 54, 23, 28,  5,  4,  6,  5 };
		calc[] listOfRightValuesList = new calc[arr.length];
		
		
//		System.out.print("[");
//		for (int i =0 ; i< arr.length; i++) {
//			System.out.print(i +", ");
//		}
//		System.out.println();
		
		for (int i=0; i<arr.length; i++) {
			listOfRightValuesList[i] = new calc();
		}
		
		int Q = leftIndexes.length;
		int N = arr.length;
		
		int[] preProcessArray =   new int[N];
		Arrays.fill(preProcessArray, -1); // -1 because we can get 0 as a '&' result of two numbers
		
		
		
		// ===================================== old way to verify just =================================
		for (int i= 0; i < Q; i++) {
			int l = leftIndexes[i]-1;
			int r =  rightIndexes[i];
			while (l < r) {
				copyarr[l] &= queryValues[i];
				l++;
			}
		}
		System.out.println("old way solving we get :");
		System.out.println(Arrays.toString(copyarr));
		// END ===================================== old way to verify just =================================

		
		for (int i=0; i <Q; i++) {
			 
			if (preProcessArray[leftIndexes[i] -1] != -1) { 
				preProcessArray[leftIndexes[i]- 1] &= queryValues[i];
			} else {
				preProcessArray[leftIndexes[i]- 1] = queryValues[i];
			}
			if (rightIndexes[i] < arr.length) {
				listOfRightValuesList[rightIndexes[i]].list.add(queryValues[i]);
			}
		}
		
		//System.out.println(Arrays.toString(preProcessArray));
		
		// preprocess Query final array preProcessArray
		calc finalcalc = new calc();
		
		for (int i=0; i <preProcessArray.length; i++) {
			preProcessArray[i] = finalcalc.add(preProcessArray[i], listOfRightValuesList[i]);
		}
		
		//System.out.println(Arrays.toString(preProcessArray));

		for (int i=0; i < N; i++) {
			if (preProcessArray[i] > 0) {
				arr[i] &= preProcessArray[i];
			}
		}
		
		System.out.println(Arrays.toString(arr));
		long end = System.currentTimeMillis();
		long timediff  = end - start;
		System.out.println("time taken in ms" + timediff);

	}
}
