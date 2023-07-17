package String_Assignment;

import java.util.*;

public class Strings_String_Compression {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String s=sc.next();;
		String s = "aabbdssc";
		Compress(s);
	}

	public static void Compress(String s) {
		String ans="";
		char prev=s.charAt(0);
		int count=1;
		for (int i = 1; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (curr==prev) {
				count++;
			} else {
				ans=ans+prev;
				if (count>1) {
					ans=ans+count;
				}
				prev=curr;
				count=1;
			}
		}
		
		// to add last character
		ans=ans+prev;
		if (count>1) {
			ans=ans+count;
		}
		System.out.println(ans);
	}
}
