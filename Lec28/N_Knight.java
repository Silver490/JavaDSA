package Lec28;

import java.util.*;

public class N_Knight {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
		int n = 4;
		boolean[][] board = new boolean[n][n];
		Nqueen(board, 0, n);
	}

	public static void Nqueen(boolean[][] board, int row, int tn) {
		if (tn == 0) {
			display(board);
			System.out.println();
			return;
		}

		for (int col = 0; col < board.length; col++) {
			if (isitsafe(board, row, col) == true) {
				board[row][col] = true;
				Nqueen(board, row + 1, tn - 1);
				board[row][col] = false;
			}
		}
	}

	private static boolean isitsafe(boolean[][] board, int row, int col) {

		// for upside
		int r = row;
		while (r >= 0) {
			if (board[r][col] == true) {
				return false;
			}
			r--;
		}
		// right diagonal
		r = row;
		int c = col;
		
		while (r >= 0 && c < board.length) {
			if (board[r][c] == true) {
				return false;
			}
			c++;
			r--;
		}

		// left diagonal
		r = row;
		c = col;
		while (r >= 0 && c >=0) {
			if (board[r][c] == true) {
				return false;
			}
			c--;
			r--;
		}
		return true;
	}
	public static void display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}
}
