package Lec29_Leetcode;
import java.util.*;
public class Palindrome_Substring {

	public static void main(String[] args) {
		String str= "naman";
		printanswer(str);
	}

	public static void printanswer(String str) {
		int count=0;
		// for odd
		for (int axis = 0; axis < str.length(); axis++) {
			
			for (int orbit = 0; orbit < str.length() && axis-orbit>=0 && axis+orbit<str.length(); orbit++) {
				if (str.charAt(axis-orbit)!=str.charAt(axis+orbit)) {
					break;
				} 
				count++;
			} 
		}
		
		// For even
		for (double axis = 0.5; axis < str.length(); axis++) {
			
			for (double orbit = 0.5; orbit < str.length() && axis-orbit>=0 && axis+orbit<str.length(); orbit++) {
				if (str.charAt((int)(axis-orbit))!=str.charAt((int)(axis+orbit))) {
					break;
				} 
				count++;
			} 
		}
		System.out.println(count);
	}
}
