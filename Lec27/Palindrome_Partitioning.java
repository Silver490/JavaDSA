package Lec27;

public class Palindrome_Partitioning {
	// Step 1
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
			
			partition(ques.substring(i), ans + s + "|"); // ques.substring(i)=itin
		}
	}
	
}
