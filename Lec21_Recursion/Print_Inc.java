package Lec21_Recursion;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		PE(n);	
	}
	
	public static void PE(int n) {
		if (n==0) {
			return;
		}
		
		PE(n-1);
		System.out.println(n);
	}
}
