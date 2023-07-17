package Recursion_Assignment;
import java.util.*;
public class Replace_0_with_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=103;
		replace(n,0);
		
	}

	public static void replace(int n,int ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		int mul=1;	
		int rem=n%10;
		if (rem==0) {
			replace(n,ans+mul*5);
			n=n/10;
			mul=mul*10;
		}
	}
}
