package Lec23;

public class Static_Var_Demo {
	static int val = 100; // Static variable can be accessed any where in the function

	public static void main(String[] args) {
		System.out.println(val);
		fun();
		System.out.println(val);
		
	}
	public static void fun() {
		System.out.println("Hey!"); 
		int val=50;
		val=val+6;
		System.out.println(val);
		
	}
}
