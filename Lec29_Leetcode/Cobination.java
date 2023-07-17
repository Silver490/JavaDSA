package Lec29_Leetcode;
import java.util.*;
public class Cobination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 4;
		int k = 2; // tatol queen
		List<Integer> list=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		boolean[] board = new boolean[n];
		printanswer(board, k, 0,list,0,ans);
		System.out.println(ans);
	}

	public static void printanswer(boolean[] board, int k, int qpsf, List<Integer> list,int last,List<List<Integer>> ans) {
		if (k==qpsf) {
			//System.out.println(ans);
			ans.add(new ArrayList<>(list));
			return;
		}
		
		
		for (int i = last; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				list.add(i+1);
				printanswer(board, k, qpsf + 1, list,i+1,ans);
				board[i]=false;
				list.remove(list.size()-1);
			}
		}
	}
}
