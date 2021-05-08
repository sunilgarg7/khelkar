package com.khelkar.sunil.DynamicProgramming;

import com.khelkar.sunil.tool.Tools;

public class KnightsPlacement {

	public static void main(String[] args) {
	
		int n = 5 ; // board length
		int[][] board = new int[n][n];
		
		int si = 0, se= 0;
		
		//while (true)
		fillKnightBoard(board, si, se, 1);
		
	}

	private static void fillKnightBoard(int[][] board, int row, int col, int n) {
		
		if ( row < 0 || col< 0 || row >= board.length || col >= board.length || board[row][col] != 0 ) {
			return;
		} else if (n == board.length * board.length){
			board[row][col] = n;
			Tools.display(board);
			board[row][col] = 0;
			return;
		}
		
		board[row][col] = n;
		fillKnightBoard(board, row -2, col +1, n+1);
		fillKnightBoard(board, row -1, col +2, n+1);
		fillKnightBoard(board, row +1, col +2, n+1);
		fillKnightBoard(board, row +2, col +1, n+1);
		fillKnightBoard(board, row +2, col -1, n+1);
		fillKnightBoard(board, row +1, col -2, n+1);
		fillKnightBoard(board, row -1, col -2, n+1);
		fillKnightBoard(board, row -2, col -1, n+1);
		board[row][col] = 0;

	}
	
	
}
