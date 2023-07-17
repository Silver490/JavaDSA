package Recursion_Assignment;
import java.util.*;
public class Form_Biggest_Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			String arr[]=new String[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt()+"";
			}
			sol(arr);
			
		}
		
	}

	public static void sol(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			String str =arr[i];
			for (int j = 0; j < arr.length-i-1; j++) {
				int res=compare(arr[j],arr[j+1]);
				if(res<0) {
					
				}
			}
		}
		
	}
	
	public static int compare(String s1,String s2) {
		String str1=s1+s2;
		String str2=s2+s1;
		long a= Long.parseLong(str1);
		long b= Long.parseLong(str2);
		if (a>b) {
			return 1;
		} 
		else if(b>a){
			return -1;
		}
		else {
			return 0;
		}
		
	}
}
