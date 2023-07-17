package Window_Sizing_Assignment;

import java.util.Scanner;

public class longest_substring_without_repeating_char {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		System.out.println(Non_Repeating(str));
	}
 public static int Non_Repeating(String str) {
	 int si=0;
	 int ei=0;
	 int frq[]=new int [256];
	 int ans=0;
	 while (ei<str.length()) {
		 
		 // grow window
		char ch= str.charAt(ei);
		frq[ch]=frq[ch]+1;
		
		// shrink window
		while (frq[ch]>1) {
			char c=str.charAt(si);
			frq[c]-=1;
			si++;
		}
		
		// answer
		ans=Math.max(ans, ei-si+1);
		ei++;
	}
	 return ans;
	
 }
}
