package Lec23;

public class Count_Of_SubSequence_2 {
	
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(answerCount(str, "")); 
		
	}

	public static int answerCount(String ques, String ans) {
		if (ques.length() == 0) {
			//System.out.println(ans);
			return 1;
		}
		char ch = ques.charAt(0);
		int a1=answerCount(ques.substring(1), ans);
		int b1=answerCount(ques.substring(1), ans + ch);
		return a1+b1;
	}
}
