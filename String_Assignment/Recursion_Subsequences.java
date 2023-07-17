package String_Assignment;

import java.util.*;

public class Recursion_Subsequences {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String str=sc.next();
		String str = "abcd";
		Subsequenc(str, "");
		System.out.println();// To change the line
		System.out.println(answerCount(str,""));

	}

	public static void Subsequenc(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch = ques.charAt(0);
		Subsequenc(ques.substring(1), ans);
		Subsequenc(ques.substring(1), ans + ch);

	}
	public static int answerCount(String ques, String ans) {
		if (ques.length() == 0) {
			//System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int a1=answerCount(ques.substring(1), ans);
		int b1=answerCount(ques.substring(1), ans + ch);
		return a1+b1;
	}
}
