package Lec21_Recursion;

public class Print_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=4;
		System.out.println(Pow(a,b));	
	}
	
	
	// recursive call is the last statement in the function then it’s known as Tail Recursion.
	// recursive call is the first statement in the function then it’s known as Head Recursion.
	public static int Pow(int a,int b) {
		if (b==0) {
			return 1;
		}
		
		
		int p=Pow(a, b-1);
		return a*p;
	}
}
