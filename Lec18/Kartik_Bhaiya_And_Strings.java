package Lec18;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		String str= sc.next();
//		String str= "abba";
//		int k = 2;
		int a= flipChar(str,k,'a'); // flip a
		int b= flipChar(str,k,'b'); // flip b
		System.out.println(Math.max(a, b));
	}

	public static int flipChar(String str, int k , char ch) {
		int si=0;
		int ei=0;
		int ans= 0;
		int flip=0;
		while (ei<str.length()) {
			if (str.charAt(ei)==ch) {
				flip++;
			}
			// Shrink karna hai
			while (flip>k && si<=ei) {
				if (str.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			
			// ans cal
			ans = Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}
}
