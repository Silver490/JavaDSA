package String_Assignment;

import java.util.*;

public class Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//String str= sc.next();
		String str= "abc";
		printSubString(str);
	}
	public static void printSubString(String str) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String s = str.substring(i,j);
					if (isPalindrome(s)==true) {
						//System.out.println(s);
						count++;
					}
			}
		}
		System.out.println(count);
	}
	public static boolean isPalindrome(String s) {
		int i=0;
		int j= s.length()-1;
		while(i<j) {
			if (s.charAt(i)!= s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
