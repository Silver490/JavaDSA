package Lec05;

import java.util.Scanner;

public class GCD_HCF{ // highest common factor

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int divisor = sc.nextInt();
		int divident = sc.nextInt();
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}

		System.out.println(divisor);
	}

}
