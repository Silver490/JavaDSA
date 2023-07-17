package Lec24;

import java.util.*;

public class Permutation_Of_string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str = "abca";
		String ans = "";

		printpermutation(str, "");

	}

	public static void printpermutation(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		boolean [] visited=new boolean[26];
		for (int i = 0; i < ques.length(); i++) {
			char ch=ques.charAt(i);
			if (visited[ch-'a']==false) {
				visited[ch-'a']=true;
				String s1 = ques.substring(0, i);
				String s2 = ques.substring(i + 1);
				printpermutation(s1 + s2, ans + ch);
			}
		}

	}
}
