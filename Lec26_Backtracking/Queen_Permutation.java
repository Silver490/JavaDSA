package Lec26_Backtracking;
import java.util.*;
public class Queen_Permutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 4; // number of blocks on board
		int tq = 2; // total queen
		boolean[] board = new boolean[n];
		printanswer(board, tq, 0, "");

	}

	public static void printanswer(boolean[] board, int tq, int qpsf, String ans) {
		if (tq==qpsf) { // qpsf = Queen place so far
			System.out.println(ans);
			return;
		}
		
		
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				printanswer(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
				board[i]=false;
			}
		}
	}
}
