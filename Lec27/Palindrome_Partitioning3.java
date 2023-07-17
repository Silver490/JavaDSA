package Lec27;

import java.util.*;

public class Palindrome_Partitioning3 {
	// Step 3: Return Answer in list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> ll= new ArrayList<>();
		partition(str, ll);
	}

	public static void partition(String ques, List<String> ll) {
		if (ques.length() == 0) {
			System.out.println(ll);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i); // when i=1,s = "n" ; i=2,s="ni"
			if(isPalindrome(s)==true) {
				ll.add(s);
				partition(ques.substring(i), ll); // ques.substring(i)=itin
				ll.remove(ll.size()-1); // 
			}
		}
	}
	
	public static boolean isPalindrome(String str) {
		int i=0;
		int j= str.length()-1;
		while(i<j) {
			if (str.charAt(i)!= str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
