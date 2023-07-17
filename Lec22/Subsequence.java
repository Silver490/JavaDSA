package Lec22;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= "abc";
		printanswer(str,"");
	}

	public static void printanswer(String ques,String ans) {
		if (ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch= ques.charAt(0);
		printanswer(ques.substring(1),ans);
		printanswer(ques.substring(1),ans+ch);
		
	}
}
