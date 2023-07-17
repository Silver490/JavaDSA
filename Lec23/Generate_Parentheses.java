package Lec23;

import java.util.*;

public class Generate_Parentheses {
	public static void main(String[] args) {
		int n = 3;
		List<String> list=new ArrayList<>();
		Generate_Paren(n, 0, 0, "",list); // open,close parenthesis =0
		System.out.println(list);
	}

	public static void Generate_Paren(int n, int open, int close, String ans,List<String> list) {

		if (open == n && close == n) {
			//System.out.println(ans + " ");
			list.add(ans);
			return;
		}
		if (open < n) {
			Generate_Paren(n, open + 1, close, ans + "(",list);
		}
		if (close < open) {
			Generate_Paren(n, open, close + 1, ans + ")",list);
		}
	}

}
