package Window_Sizing_Assignment;

import java.util.Scanner;

public class Non_Repeating_Character {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			String str= sc.next();
			Non_Repeating(str);
			
		}
		//String str= "codingblocks";
		//System.out.println(Non_Repeating(str));
	}
 public static void Non_Repeating(String str) {
	 int frq[]= new int [256];
	 char ans;
	 for (int i = 0; i < str.length(); i++) {
		 char ch= str.charAt(i);
		 frq[ch]+=1;
		 
	}
	 for (int i = 0; i < str.length(); i++) {
		 char c=str.charAt(i);
		if (frq[c]==1) {
			ans=c;
			System.out.println(ans);
			return;
		} 
	}
	 
	 
 }
}
