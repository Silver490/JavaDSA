package String_Assignment;

import java.util.*;

public class Toggle_Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s=sc.next();;
		String s = "aBcD";
		Toggle(s);
	}

	public static void Toggle(String s) {
		String ans="";
		for (int i = 0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if (ch>= 'A' && ch<= 'Z' ){
				ans=ans+ (char)(ch+32); // 97-65=32
			} else {
				ans=ans+ (char)(ch-32);
			}
		}
		System.out.println(ans);
	}
}
