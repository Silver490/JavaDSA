package Lec29_Leetcode;

import java.util.*;

public class Form_Minimum_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0) {
		String str= sc.next();
		//String str= "DDIIDI";
		printanswer(str);
		System.out.println();
		}
	}

	public static void printanswer(String str) {
		int [] ans= new int [str.length()+1];
		int num=1;
		for (int i = 0; i <= str.length(); i++) {
			if (i==str.length()|| str.charAt(i)=='I') {
				ans[i]=num;
				num++;
				for (int j = i-1; j >=0 && str.charAt(j)=='D' ; j--) {
					ans[j]=num;
					num++;
				}
			}
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}
	}
}
