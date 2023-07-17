package String_Assignment;

import java.util.*;

public class Strings_Odd_Even_Character{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //String s=sc.next();;
		 String s="abcd";
		 String s2="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (i%2==0) { // Even
				
				s2=s2+ (char)(ch+1);
			} else {
				s2=s2+ (char)(ch-1);
			}
		}
		System.out.println(s2);
	}
}
