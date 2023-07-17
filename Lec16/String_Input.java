package Lec16;

import java.util.Scanner;

public class String_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		String s= sc.next();  // only print one word
//		System.out.println(s);
//		
//		String s1= sc.nextLine(); // print all line
//		System.out.println(s1);
		
		String s= "HelloByeokeyHey";
		System.out.println(s.length());// s.length() is a method
		
		// to check the char at index 5
		System.out.println(s.charAt(5));
		
		String s1= "HelloByeokeyHey";
		// to compare contents of string
		System.out.println(s.equals(s1));
		
		String s2= "rat";
		String s3="raju";
		System.out.println(s2.compareTo(s3));// s2>s3 +ve or s3>s2 -ve or s3==s2 0
		
		System.out.println(s.substring(3)); // from 3rd index to entire string
		
		System.out.println(s.substring(0, 6)); // 0 to 5th index
	}

}
