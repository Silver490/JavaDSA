package Recursion_Assignment;

import java.util.*;

import java.util.Scanner;

public class Generate_Parentheses {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		
		Generate_Paren(n, 0, 0, ""); // open,close parenthesis =0
		
	}

	public static void Generate_Paren(int n, int open, int close, String ans) {

		if (open == n && close == n) {
			System.out.println(ans + " ");
			
			return;
		}
		if (close < open) {
			Generate_Paren(n, open, close + 1, ans + ")");
		}
		if (open < n) {
			Generate_Paren(n, open + 1, close, ans + "(");
		}
	}

}
