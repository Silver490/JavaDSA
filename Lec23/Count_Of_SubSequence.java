package Lec23;

public class Count_Of_SubSequence {
	static  int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcd";
		answerCount(str, "");
		System.out.println(count);

	}

	public static void answerCount(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch = ques.charAt(0);
		answerCount(ques.substring(1), ans);
		answerCount(ques.substring(1), ans + ch);

	}
}
