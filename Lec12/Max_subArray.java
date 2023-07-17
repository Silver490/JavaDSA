package Lec12;

import java.util.Iterator;
import java.util.Scanner;

public class Max_subArray{

	public static void main(String[] args) {

		int[] arr = { -2,1,-3,4,-1,2,1,-5,4 };

		System.out.println(SubArray_Sum(arr));
		
	}

	public static int SubArray_Sum(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int[] left = new int[n];
		//left[0] = arr[0];
		int ans=Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum=0;
			for(int j=i; j<n; j++) {
				sum = sum + arr[j];
				ans = Math.max(ans, sum);
			}
		}
		
		return ans;
	
	}
}
