package Recursion_Assignment;

import java.util.*;

public class Strings_Difference_Ascii_Codes{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //String s=sc.next();;
		 String s="abcd";
		 String s2="";
		for (int i = 0; i < s.length(); i++) {
			int n=(int)(s.charAt(i) -s.charAt(i+1));
			System.out.println(n);
			//s2= (char)s.charAt(i) +(n));
		
		}
		//s2=s2+ (char)(s.charAt(i)-1);
		//System.out.println(s2);
	}
}
