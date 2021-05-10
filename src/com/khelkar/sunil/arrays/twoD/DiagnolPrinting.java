package com.khelkar.sunil.arrays.twoD;

import java.util.ArrayList;

import com.khelkar.sunil.aa_utility.ArrayUtil;
import com.khelkar.sunil.tool.Print;
import com.khelkar.sunil.tool.Tools;

public class DiagnolPrinting {
	
	static {
		Print.PRINT_COMMENTS = false;
	}
	
	public static void main(String[] args) {
		print1stPointDiagnol();
	}
	

	private static void print1stPointDiagnol() {
		
		int[][] arr = ArrayUtil.src_Rect2;
		int rows = arr.length;
		int cols = arr[0].length;
		
        ArrayList<Integer> collector = new ArrayList<Integer>(rows * cols);
		int totalDiagnols = rows + cols -1;
		
		for (int diagonal= 0; diagonal < rows; diagonal++) {
			int row = diagonal;
			int col = 0;
			while (row >= 0  && col < cols) {
				System.out.print("(" + row + " " + col + ")| ");
				collector.add(arr[row][col]);
				row--;
				col++;
			}
		} // end of half "diagonal" loop 
		
		//	System.out.println("\n"+ collector);// half collected values or 1st half display

		for (int diagonal= rows+1  ; diagonal <= totalDiagnols; diagonal++) {
			int row = rows-1;
			int col = diagonal - rows ;
			while (row >= 0  && col < cols) {
				System.out.print("(" + row + " " + col + ")| ");
				collector.add(arr[row][col]);
				row--;
				col++;
			}
		} // end of half "diagonal" loop 

		Tools.fillArrayWithCollectorAndPrint(arr, collector);
		System.out.println("\n Collector : - "+ collector);

	}
}
