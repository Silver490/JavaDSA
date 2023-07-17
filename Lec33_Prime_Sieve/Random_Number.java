package Lec33_Prime_Sieve;

import java.util.Random;

public class Random_Number {
	public static void main(String[] args) {

		int lo = 10;
		int hi = 100;
		Random rn = new Random();

		for (int i = 0; i < 10; i++) {
			int r = rn.nextInt(hi - lo + 1) + lo;
			System.out.print(r + " ");
		}
	}

}
