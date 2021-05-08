package com.khelkar.sunil.arrays;

import com.khelkar.sunil.tool.Tools;

// we will do a 90' rotate
public class MatrixRight90DegreeRotate {
	public static void main(String[] args) {
		int[][] src= { 	{4, 5, 7, 98, 9}, 
					 	{1, 4, 6,  1, 2},
					 	{3, 6, 1,  2, 1},
					 	{11,23,33, 1, 21},
					 	{54,21, 3, 2, 1 }};
		
		Tools.display(src);
System.out.println(" Matrix before transpose or actual ");
		int shellNum = 1;
		
		
		int row = src.length ;
		int cols = src[0].length;
		
		// if row and cols are not equal then we need a new matrix or int[][] 
		// as we can't do INPLACE replace
		
		
		// first transpose;
		int temp = 0 ;
		for (int i=0; i< row; i++) {
			for (int j=i+1; j< cols; j++) {
				temp = src[i][j];
				src[i][j] = src[j][i];
				src[j][i] = temp;
			}
		}
	//	Tools.display(src);
		
		// now for 90 degree movement for original src, we just have to reverse the rows
		
		for (int i=0; i < row; i++) {
			for (int j=0; j  < cols/2; j++) {
				temp = src[i][j];
				src[i][j] = src[i][cols - j - 1];
				src[i][cols- j - 1] = temp;
			}
		}
		Tools.display(src);

	}
}
