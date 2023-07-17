package Recursion_Assignment;

import java.util.*;

public class N_Queen_hard {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
		int n = 4;
		boolean[][] board = new boolean[n][n];
		int ans=Nqueen(board, 0, n);
		System.out.println(ans);
	}

	public static int Nqueen(boolean[][] board, int row, int tq) {
		if (tq == 0) {

			return 1;
		}
		int ans=0;
		for (int col = 0; col < board.length; col++) {
			if (isitsafe(board, row, col) == true) {
				board[row][col] = true;
				ans+=Nqueen(board, row + 1, tq - 1);
				board[row][col] = false;
			}
		}
		return ans;
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
	
}
