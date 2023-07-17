package Lec30;
import java.util.*;
public class Quick_Sort {
	// // time complexity is --> N^2
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr= {5,7,2,3,8,9,1,4};
		Sort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Sort(int []arr,int si,int ei) {
		if (si>=ei) {
			return;
		}
		
		int pi=partition(arr, si, ei);
		Sort(arr,si,pi-1);
		Sort(arr,pi+1,ei);
	}
	
	public static int partition(int []arr,int si,int ei) {
		int item=arr[ei];  
		int pi=si;  
		for (int i = si; i < ei; i++) {
			if (arr[i]<item) {
				int ii=arr[i];
				arr[i]=arr[pi];
				arr[pi]=ii;
				pi++;
			}
		}
		int ii=arr[ei];
		arr[ei]=arr[pi];
		arr[pi]=ii;
		return pi;
	}
}
