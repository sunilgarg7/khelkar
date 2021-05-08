package com.khelkar.sunil.DynamicProgramming;

public class NQueensSitingArrangement {

	public static void main(String[] args) {
		
		int n = 4; // number of queens
		
		boolean[][] board = new boolean[n][n];
 		boolean[] cols = new boolean[n];
		boolean[] normalDiags = new  boolean[ 2 * n - 1];
		boolean[] reverseDiags = new boolean[ 2 * n - 1];
		String res = "";
		
		fillBoard(board, 0, cols, normalDiags, reverseDiags, res);
	}

	private static void fillBoard(boolean[][] board, int row, boolean[] cols, boolean[] normalDiags, boolean[] reverseDiags, String res) {
		 if (row == board.length) {
			 System.out.println(res);
			 System.out.println("reached");
			 return;
		 }
		
		
		for (int col = 0; col < board.length; col++) {
			if (cols[col] == false && normalDiags[row + col] == false && reverseDiags[row - col + board.length - 1] == false) {
				board[row][col] = true;
				cols[col] = true; 
				normalDiags[row + col] = true;
				reverseDiags[row - col + board.length -1 ] = true;
				fillBoard(board, row+1, cols, normalDiags, reverseDiags, res + "-" + row + "-" + col + "\n");
				board[row][col] = false;
				cols[col] = false;
				normalDiags[row + col] = false;
				reverseDiags[row - col + board.length -1 ] = false;
			}
		}
	}
}
