package Lec24;
import java.util.*;
public class Letter_Combinations_of_Phone_Number {
	static String [] key= {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "12";
		KeyPress(str, "");

	}

	public static void KeyPress(String ques, String ans) {
		if (ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch=ques.charAt(0);
		String press=key[ch-'0'];
		for (int j = 0; j < press.length(); j++) {
			KeyPress(ques.substring(1),ans+press.charAt(j));
		}

	}
}
