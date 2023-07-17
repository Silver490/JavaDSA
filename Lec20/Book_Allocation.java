package Lec20;

import java.util.Arrays;
import java.util.Scanner;

public class Book_Allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();	
		while(t-- > 0) {
			int nop = sc.nextInt();// number of pages
			int nos= sc.nextInt(); // number of cows
			int [] page= new int [nop];
			for (int i = 0; i < page.length; i++) {
				page[i]=sc.nextInt();
			}
			System.out.println(MinPage(page, nos));
			
		}
//		int[] page = { 10, 20, 30, 40 };
//		int nos = 2;


	}

	public static int MinPage(int[] page, int nos) {

		int lo = 0;
		int hi = 0;
		
		for (int i = 0; i < page.length; i++) {
			hi= hi+page[i];
		}
//		for (int v : page) {
//			hi = hi + lo;
//		}

		int ans = 0;
		while (lo <= hi) {
			int mid = (hi + lo) / 2;
			if (isitpossible(page, nos, mid) == true) {
				ans = mid;
				hi = mid - 1; // to minimize

			} else {
				lo = mid + 1;
			}
		}
		return ans;

	}

	public static boolean isitpossible(int[] page, int nos, int mid) {
		int student = 1;
		int readpage = 0;
		int i = 0;
		while (i < page.length) {
			if (readpage + page[i]<= mid) {
				readpage=readpage + page[i];
				 i++;
			}
			else {
				student ++;
				readpage=0;
			}
			if (student > nos) {
				return false;
			}
			
		}
		return true;
	}
}
