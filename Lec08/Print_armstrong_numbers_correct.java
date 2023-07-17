package Lec08;

import java.util.Scanner;

public class Print_armstrong_numbers_correct {

	public static void main(String args[])
	   { 
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		IsArmstrong(n1, n2);
	}
	public static void IsArmstrong(int a, int b) {
	
	
		for (int i = a; i <= b; i++) {
			
			int temp = i; // store in temporary variable temp so u dont change the value of i
			int sum = 0;
			int cod = count(i); //
			int c = cod;
			while (c > 0) { // cod >0 you are chnaging the value of cod, use a temp variable
				int rem = temp % 10;
				sum = (int) (sum + Math.pow(rem, cod));
				temp/=10;
				c--;
				
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}
	public static int count(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}

