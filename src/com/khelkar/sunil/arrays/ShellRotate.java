package com.khelkar.sunil.arrays;

import java.util.Arrays;

import com.khelkar.sunil.tool.Tools;

public class ShellRotate {
	public static void main(String[] args) {
		int[][] src= { 	{4,  5,   7, 98,  98,  9},
						{7,  3,  13,  8,  11, 21},
					 	{1,  4,   6,  1,  51,  2},
					 	{3,  6,   1,  2,  22,  1},
					 	{11, 23, 33,  1,  31, 61},
					 	{54, 21,  3,  2,   2,  1} };
		
		int shellNum = 2; // shell number starts from 1
		int rotate = 2; 
		
		int row = src.length ;
		int cols = src[0].length;
		
		// we will do a shell rotate
		// take out required shell into one-D array
		// rotate that one-D array 
		// fill that rotate one-D array back into the shell
		
		shellRotate(src, shellNum, rotate);
		int [] arr = {1,2,3,4,5,6,7,8};
//		rotateOneDArray(arr, 3);
//		System.out.println(Arrays.toString(getShellElementsInOneDArray(src, shellNum)));
		System.out.println();
		Tools.display(src);
	}

	
	private static void shellRotate(int[][] src, int shellNum, int rotate) {
		
		int[] oneDArray = getShellElementsInOneDArray(src, shellNum);
		rotateOneDArray(oneDArray, rotate);
		fillMatrixWithRotatedOneDArray(src, oneDArray, shellNum);
			
	} 
	

	private static void fillMatrixWithRotatedOneDArray(int[][] src, int[] oneDArray, int shellNum) {
		System.out.println("whil filling");
		System.out.println(Arrays.toString(oneDArray));
		int topI = shellNum -1;
		int topJ = shellNum -1;
		int bottomI = src.length - shellNum;
		int bottomJ = src[0].length - shellNum;
		int count = 0; 
		for (int i= topI; i < bottomI; i++ ) {
			src[i][topJ] = oneDArray[count++];
		}
		
		for (int j= topJ; j< bottomJ; j++) {
			src[bottomI][j] = oneDArray[count++];
		}
		
		for (int i=bottomI; i > topI; i--) {
			src[i][bottomJ] = oneDArray[count++];
		}
		
		for (int j=bottomJ; j>topJ; j--) {
			src[topI][j] = oneDArray[count++];
		}
		
	}


	private static int[] getShellElementsInOneDArray(int[][] src, int shellNum) {
		int topStartI = shellNum -1 ;
		int topStartJ = shellNum -1 ;
		int bottomEndI = src.length - shellNum ;
		int bottomEndJ = src[0].length - shellNum;
		int totalElements = 2 * (bottomEndI - topStartI + 1 ) + 2 * (bottomEndJ - topStartJ + 1) - 4;
		int [] oneDarray = new int[totalElements];
		
		int count= 0;
		for (int i=topStartI; i<= bottomEndI; i++) {
			oneDarray[count++] = src[i][topStartJ];
		}
		for (int j=topStartJ + 1; j<= bottomEndJ; j++) {
			oneDarray[count++] = src[bottomEndI][j];
		}
		for (int i=bottomEndI -1; i >= topStartI; i--) {
			oneDarray[count++] = src[i][bottomEndJ];
		}
		for (int j=bottomEndJ - 1 ; j > topStartJ ; j--) {
			oneDarray[count++] = src[topStartI][j];
		}
		
		System.out.println("one d array");
		System.out.println(Arrays.toString(oneDarray));
		return oneDarray;
	}


	private static void rotateOneDArray(int[] oneDArray, int rotate) {
		int len = oneDArray.length;
		if (rotate > len) {
			rotate = rotate % len;
		} else if (rotate < 0) {
			rotate = len - rotate ;
		}
		
		// rotate upto rth element then rotate remaining elements and then rotate complete array
		rotateNElements(oneDArray, 0 , rotate - 1 );
		rotateNElements(oneDArray, rotate , len-1);
		rotateNElements(oneDArray, 0 , len-1);

		System.out.println("rotate after");
		System.out.println(Arrays.toString(oneDArray));
	}
	
	public static void rotateNElements(int [] oneDArray ,int start, int end ) {
		int temp =0 ;
		while (start < end) {
			temp = oneDArray[start];
			oneDArray[start]= oneDArray[end];
			oneDArray[end] = temp;
			start++; end--;
		}
	}
	
}
