package com.khelkar.sunil.arrays.twoD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.khelkar.sunil.aa_utility.ArrayUtil;

// https://leetcode.com/problems/diagonal-traverse/

public class ZigZagArrayPrinting {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(findDiagonalOrder(ArrayUtil.src_Rect2)));
	}// [1, 2, 6, 3, 7, 11, 4, 8, 12, 16, 5, 9, 13, 17, 21, 26, 10, 14, 18, 22, 27, 15, 19, 23, 28, 20, 24, 29, 25, 30]

	
	    public static int[] findDiagonalOrder(int[][] matrix) {
	        
	        // Check for empty matrices
	        if (matrix == null || matrix.length == 0) {
	            return new int[0];
	        }
	        
	        // Variables to track the size of the matrix
	        int rows = matrix.length;
	        int columns = matrix[0].length;
	        
	        // The two arrays as explained in the algorithm
	        int[] result = new int[rows*columns];
	        int k = 0;
	        ArrayList<Integer> intermediate = new ArrayList<Integer>();
	        
	        // We have to go over all the elements in the first
	        // row and the last column to cover all possible diagonals
	        for (int d = 0; d < rows + columns - 1; d++) {
	            
	            // Clear the intermediate array every time we start
	            // to process another diagonal
	            intermediate.clear();
	            
	            // We need to figure out the "head" of this diagonal
	            // The elements in the first row and the last column
	            // are the respective heads.
	            int r = d < columns ? 0 : d - columns + 1;
	            int c = d < columns ? d : columns - 1;
	            
	            // Iterate until one of the indices goes out of scope
	            // Take note of the index math to go down the diagonal
	            while (r < rows && c > -1) {
	                
	                intermediate.add(matrix[r][c]);
	                ++r;
	                --c;
	            }
	                
	            // Reverse even numbered diagonals. The
	            // article says we have to reverse odd 
	            // numbered articles but here, the numbering
	            // is starting from 0 :P
	            if (d % 2 == 0) {
	               Collections.reverse(intermediate);
	            }
	            
	            for (int i = 0; i < intermediate.size(); i++) {
	                result[k++] = intermediate.get(i);
	            }
	        }
	        return result;
	    }
}
