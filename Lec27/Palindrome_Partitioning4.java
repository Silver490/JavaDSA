package Lec27;

import java.util.*;

public class Palindrome_Partitioning4 {
	// Step 3: Return Answer in 2D list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> ll= new ArrayList<>();
		List<List<String>> ans= new ArrayList<>();
		partition(str, ll,ans);
		System.out.println(ans);
	}

	public static void partition(String ques, List<String> ll,List<List<String>> ans) {
		if (ques.length() == 0) {
			//System.out.println(ll);
			
			//List<String> list=new ArrayList<>(ll);
			//ans.add(list);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i); 
			if(isPalindrome(s)==true) {
				ll.add(s);
				partition(ques.substring(i), ll,ans);
				ll.remove(ll.size()-1);  
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
