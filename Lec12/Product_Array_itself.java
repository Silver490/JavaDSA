package Lec12;

import java.util.Iterator;
import java.util.Scanner;

public class Product_Array_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int nums= sc.nextInt();
//		int [] arr= new int [nums];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=sc.nextInt();	
//			}
		int [] arr= {1,2,3,4};
		
		Product_Array(arr);
//		for(int i=0; i<ans.length; i++) {
//			System.out.print(arr[i]+" ");	
//			}
	}
	
	public static void Product_Array(int [] arr) {
		// TODO Auto-generated method stub
		int [] left = new int [arr.length];
		left[0]=1;
		for (int i = 1; i < left.length; i++) {
			left[i]=left[i-1]*arr[i-1];
		}
		
		int [] right=new int [arr.length];
		int n=arr.length;
		right[n-1]=1;
		for (int i = n-2; i >= 0; i--) {
			right[i]=right[i+1]*arr[i+1];
		}
		
		for (int i = 0; i < right.length; i++) {
			left[i]=left[i]*right[i];
			System.out.print(left[i]+" ");
		}
		
	}
}
