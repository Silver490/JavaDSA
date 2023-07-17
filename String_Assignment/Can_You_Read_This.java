package String_Assignment;

import java.util.*;

public class Can_You_Read_This{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 //String s=sc.next();;
		 String s="IAmACompetitiveProgrammer";
		 String ans="";
		 
		 ans= ans+s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			char ch= s.charAt(i);
			if (ch>='A' && ch<='Z') {
				System.out.println(ans);
				ans="";
				ans=ans+ch;
			}else {
				ans=ans+ch;
			}

		}
		System.out.println(ans);
	}
}
	
