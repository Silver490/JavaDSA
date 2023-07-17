package Lec27;

public class Palindrome_Partitioning2 {
	// Step 2: Print only Palindrome
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		partition(str, "");
	}

	public static void partition(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i); // when i=1,s = "n" ; i=2,s="ni"
			if(isPalindrome(s)==true) {
				partition(ques.substring(i), ans + s + "|"); // ques.substring(i)=itin
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
