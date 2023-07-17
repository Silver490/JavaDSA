package String_Assignment;

import java.util.*;

public class Remove_Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s=sc.next();;
		String s = "aaabacb";
		Duplicate(s);
	}

	public static void Duplicate(String s) {
		String ans="";
		char prev=s.charAt(0);
		int count =1;
		for (int i = 1; i < s.length(); i++) {
			char curr= s.charAt(i);
			if (curr==prev) {
				count++;
			} else {
				ans= ans+prev;
				prev =curr;
				count=1;
			}
		}
		ans=ans+prev;
		System.out.println(ans);
	}
}
