package String_Assignment;

import java.util.*;

public class Strings_Diff_Ascii{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //String s=sc.next();;
		 String s="abcd";
		
		 Diff(s,"");
	}
	
	public static void Diff(String s, String ans) {
		int i=0;
		int j=i+1;
		while (i<s.length() && j<s.length()) {
			int n= s.charAt(j)-s.charAt(i);
			ans=ans+ s.charAt(i)+n;
			if (j==s.length()-1) {
				ans=ans+ s.charAt(j);
			}
			i++;
			j++;
		}
		System.out.println(ans);
	}
}
