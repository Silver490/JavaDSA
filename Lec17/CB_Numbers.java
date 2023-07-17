package Lec17;

import java.util.Scanner;

public class CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String s="";
	    do{
	       s = sc.nextLine();
	    }while(s.length() != n);
		//String str= "81615";
		Print_substring(s);
	
		
		
	}
	
	// Print SubString Length wise
	public static void Print_substring(String str) {
		int count =0;
		boolean [] vis= new boolean[str.length()];
		for (int len = 1; len <=str.length(); len++) {
			for (int j = len; j <=str.length(); j++) {
				int i= j-len;
				String s = str.substring(i,j);
				
				// Integer.parseInt(s) num string ko int me convert karega
				// Long.parseInt(s) num string ko long me convert karega
				if (isCBNumber(Long.parseLong(s))==true && isVisited(vis,i,j-1)) {
					count++;
					for (int k = i; k < j; k++) {
						vis[k]=true;
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static boolean isVisited(boolean [] vis,int i,int j) {
		for (int k = i; k <=j; k++) {
			if (vis[k]==true) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static boolean isCBNumber(long n) {
		if (n==0 || n==1) {
			return false;
		}
		int []arr = {2,3,5,7,11,13,17,19,23,29};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==n) {
				return true;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (n%arr[i]==0) {
				return false;
			}
		}
		
		return true;
	}

	
}
