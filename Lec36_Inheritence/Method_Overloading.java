package Lec36_Inheritence;

import java.util.Iterator;

public class Method_Overloading {
	// Method Overloading happens in same class
	public static void main(String[] args) {
		System.out.println(add(2,4));
		System.out.println(add(2,4,9));
		System.out.println(add(2,4,9.6f));
		System.out.println(add(2,4,5,6,7,8,9,6,5,3,4,23,1));
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b,int c) {
		return a+b+c;
	}
	public static int add(int a, int b,float c) {
		return (int)(a+b+c);
	}
	public static int add(int a, int b,int c, int d) {
		return a+b+c+d;
	}
	public static int add(int x, int y,int...a) { // (triple dot argument)  variable no of argument
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		return sum +x+y;
	}
}
