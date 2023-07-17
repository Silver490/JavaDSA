package String_Assignment;

import java.util.*;

public class String_Max_Freq_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s=sc.next();;
		String s = "aaabacb";
		Max_Freq(s);
	}

	public static void Max_Freq(String s) {
		int [] frq = new int [26];
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			frq[ch-'a']=frq[ch-'a']+1;
		}
		int max_i=0;
		for (int i = 1; i < frq.length; i++) {
			if (frq[i]>frq[max_i]) {
				max_i=i;
			}
		}
		
		char ch= (char)(max_i+'a');
		System.out.println(ch);
	}
	
}
