package com.khelkar.sunil.arrays.twoD;

import com.khelkar.sunil.tool.Print;
import com.khelkar.sunil.tool.Tools;

public class DiagnolFillingOfMatrix {
	
	static {
		Print.PRINT_COMMENTS = false;
	}
	
	public static void main(String[] args) {
		int rows = 5, cols =7;
		 print1stPointDiagnol(rows, cols);
		 print2ndPointDiagnol(rows, cols);
		 print3rdPointDiagnol(rows, cols);
		 print4rthPointDiagnol(rows, cols);
	}
	
//-------------------------------IST point-----------------------------------------------------------------------------------------
	private static void print1stPointDiagnol(int rows, int cols) {
		System.out.println("\n First Point Matrix filling : \n");
		int[][] arr = new int[rows][cols];//ArrayUtil.src_Rect2;
		
		int totalDiagnols = rows + cols -1;
		int count = 1;
		for (int diagonal= 0; diagonal < rows; diagonal++) {
			int row = diagonal;
			int col = 0;
			while (row >= 0  && col < cols) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row--;
				col++;
			}
		} // end of half "diagonal" loop 
		
		for (int diagonal= 1  ; diagonal < cols; diagonal++) {
			// figure out the head of each diagonal
			int row = rows-1;
			int col = diagonal ;
			while (row >= 0  && col < cols) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row--;
				col++;
			}
		} // end of half "diagonal" loop 

		Tools.display(arr);
	}
	
//-------------------------------2ND point-----------------------------------------------------------------------------------------

	private static void print2ndPointDiagnol(int rows, int cols) {
		System.out.println("\n 2nd Point Matrix filling : \n");

		int[][] arr = new int[rows][cols];//ArrayUtil.src_Rect2;
		
		int totalDiagnols = rows + cols -1;
		int count = 1;
		
		for (int diagonal= 0; diagonal < cols; diagonal++) {
			// figure out the head of each diagonal
			int row = 0;
			int col =  cols - diagonal -1;
			while (row < rows  && col < cols) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row++;
				col++;
			}
		} // end of half "diagonal" loop 
		
		//half fill display
		// Tools.display(arr);

		
		for (int diagonal= 1  ; diagonal < rows; diagonal++) {
			int row = diagonal;
			int col = 0;
			while (row < rows  && col < cols) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row++;
				col++;
			}
		} // end of half "diagonal" loop 

		Tools.display(arr);
	}
	
	//-------------------------------3RD point-----------------------------------------------------------------------------------------
	private static void print3rdPointDiagnol(int rows, int cols) {
		System.out.println("\n 3rd Point Matrix filling : \n");

		int[][] arr = new int[rows][cols];//ArrayUtil.src_Rect2;
		
		int totalDiagnols = rows + cols -1;
		int count = 1;
		
		for (int diagonal= 0; diagonal < rows; diagonal++) {
			// figure out the head of each diagonal
			int row = rows - diagonal - 1;
			int col =  cols -1;
			while (row < rows   && col > 0) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row++;
				col--;
			}
		} // end of half "diagonal" loop 
		
		// half fill display
		// Tools.display(arr);

		
		for (int diagonal= 1  ; diagonal < cols; diagonal++) {
			int row = 0;
			int col = cols - diagonal -1;
			while (row < rows  && col >= 0) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row++;
				col--;
			}
		} // end of half "diagonal" loop 

		Tools.display(arr);
	}
	
	//-------------------------------4RTH point-----------------------------------------------------------------------------------------
	private static void print4rthPointDiagnol(int rows, int cols) {
		System.out.println("\n 4rth Point Matrix filling : \n");

		int[][] arr = new int[rows][cols];//ArrayUtil.src_Rect2;
		
		int totalDiagnols = rows + cols -1;
		int count = 1;
		
		for (int diagonal= 0; diagonal < cols; diagonal++) {
			// figure out the head of each diagonal
			int row = rows - 1;
			int col =  diagonal;
			while (row >= 0   && col >= 0) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row--;
				col--;
			}
		} // end of half "diagonal" loop 
		
		// half fill display
		// Tools.display(arr);

		
		for (int diagonal= 1 ; diagonal <= rows; diagonal++) {
			int row = rows - diagonal - 1 ;
			int col = cols -1;
			while (row >= 0  && col >= 0) {
				System.out.print("(" + row + " " + col + ")| ");
				arr[row][col] = count++;
				row--;
				col--;
			}
		} // end of half "diagonal" loop 

		Tools.display(arr);
	}

}
