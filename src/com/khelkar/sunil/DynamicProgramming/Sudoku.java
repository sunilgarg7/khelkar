package com.khelkar.sunil.DynamicProgramming;

import java.util.HashMap;

public class Sudoku {

	public static void main(String[] args) {
		
		int[][] board = new int[9][9];
		// randomly filled sudoku board or we should get board as input to our program
//		display(board);
		
		boolean[][] rowarr = new boolean[board.length][board.length + 1]; // +1 because my values lies from 1 to 9 instead of 0 to 8
		boolean[][] colsArr = new boolean[board.length][board.length + 1];
		HashMap<String, boolean[]> subgroup = new HashMap<String, boolean[]>();
		subgroup.put("00", new boolean[board.length + 1]);
		subgroup.put("03", new boolean[board.length + 1]);
		subgroup.put("06", new boolean[board.length + 1]);
		subgroup.put("30", new boolean[board.length + 1]);
		subgroup.put("33", new boolean[board.length + 1]);
		subgroup.put("36", new boolean[board.length + 1]);
		subgroup.put("60", new boolean[board.length + 1]);
		subgroup.put("63", new boolean[board.length + 1]);
		subgroup.put("66", new boolean[board.length + 1]);
		
		// we should traverse our given sudoku board to 
		
		sudoku(board, 0, 0, rowarr, colsArr, subgroup);
		
	}
	
	public static void sudoku (int[][] board, int i, int j, boolean[][] rowArr, boolean[][] colsArr, HashMap<String, boolean[]> subgroup) {

		int subgroupI = (i/3) * 3; 
		int subGroupj = (j/3) * 3; 
		
		int nI =0, nJ = 0;
		
		if (i== board.length && j==0) {
			// then we have reached to the end of the board
			// Print Board and return
			
			display(board);
			return;
		} else {
			if (j == board.length-1) {
				nJ= 0;
				nI = i+1;
			} else {
				nI = i;
				nJ = j+1;
			}
		}

		if (board[i][j] != 0) {
			// nothing to do here continue; as it is already filled
			// we dont need to take this value as we have already filled in pre processing step
			sudoku(board, nI, nJ, rowArr, colsArr, subgroup);
			return;
		} else  {
		
		for (int val = 1; val <= 9; val++) {
			// if any of the rowArr or colsArr or subGroup contains this val for given i & j then we also have to do nothing 
			
		  if (rowArr[i][val] == false && colsArr[j][val] == false && subgroup.get("" + subgroupI + subGroupj)[val] == false) {
				rowArr[i][val] 										= true;
				colsArr[j][val] 									= true;
				subgroup.get("" + subgroupI + subGroupj)[val]		= true;
				board[i][j] 										= val;
				sudoku(board, nI, nJ, rowArr, colsArr, subgroup);
				// clear whatever value we have set in this iteration.
				board[i][j] 										= 0;
				rowArr[i][val] 										= false;
				colsArr[j][val] 									= false;
				subgroup.get("" + subgroupI + subGroupj)[val]		= false;
			}
					// How we are going to say that this board cannot proceed further as we have
					// selected some of the vals at particular place which are not apt, so how do we get back
				    // to the original space ?? this will help you understand what all parameters are required
					// while doing backtracking or recursive calls;
		} // End Of value loop 1 to 9 
		}	
	}
	
	public static void display(int[][] board) {
		String str = "";
		for (int i=0; i < board.length; i++) {
			for (int j=0; j< board.length; j++) {
				str +=  board[i][j] + " ";
			}
			str += "\n";
		}
		System.out.println(str);
	}
}
