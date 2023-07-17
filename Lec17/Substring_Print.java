package Lec17;

import java.util.Iterator;

public class Substring_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "sayeed";
		printSubString(str);
	}
	public static void printSubString(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				String s = str.substring(i,j);
					if (isPalindrome(s)==true) {
						System.out.println(s);
					}
			
			}
		}
	}
	public static boolean isPalindrome(String str) {
		int i=0;
		int j= str.length()-1;
		while(i<j) {
			if (str.charAt(i)!= str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
