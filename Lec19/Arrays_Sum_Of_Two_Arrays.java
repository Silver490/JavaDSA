package Lec19;

import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
//		Scanner sc  = new Scanner(System.in);
//		int n= sc.nextInt();
//		int [] arr= new int [n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
//		int m= sc.nextInt();
//		int [] brr= new int [m];
//		for (int i = 0; i < brr.length; i++) {
//			brr[i]=sc.nextInt();
//		}
//		SumOfTwoArray(arr,brr);
		
		int [] arr= {1,0,2,9};
		int [] arr1= {3,4,5,6,7};
		SumOfTwoArray(arr,arr1);
		
		
	}
	
	
	public static void SumOfTwoArray(int []arr1, int [] arr2) {
		int carry=0;
		int i=arr1.length-1;
		int j=arr2.length-1;
		ArrayList<Integer> list =new ArrayList<>();
		while(i>=0 || j>=0) {
			int sum= 0;
			if (i>=0) {
				sum+= arr1[i];
				i--;
				
			}
			
			if (j>=0) {
				sum+= arr2[j];
				j--;	
			}
			
			sum+= carry;
			list.add(sum%10);
			carry=sum/10;
			
		}
		
		if (carry>0) {
			list.add(carry);
		}
		for (int k = list.size()-1; k >=0 ; k--) {
			System.out.print(list.get(k)+", ");
		}
		System.out.println("END");
	}
}
