package Lec30;
import java.util.*;
public class Merge_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr= {5,7,2,3,8,9,1,4};
		
		
		int[] ans=Sort(arr,0,arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	public static int[] Sort(int []arr,int si,int ei) {
		if (si==ei) {
			int[] bs=new int[1];
			bs[0]=arr[si];
			return bs;
		}
		
		int mid= (si+ei)/2;
		int []a=Sort(arr,si,mid);
		int []b=Sort(arr,mid+1,ei);
		
		return MergeTwoArray(a,b);
	}
	public static int[] MergeTwoArray(int []arr1,int []arr2) {
		int i=0;  // to iterate over arr1
		int j=0;  // to iterate over arr2
		int k=0;  // to iterate over ans
		int [] ans=new int[arr1.length+arr2.length];
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]>arr2[j]) {
				ans[k]=arr2[j];
				j++;
				k++;
			} else {
				ans[k]=arr1[i];
				i++;
				k++;
			}
		}
		while (i<arr1.length) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while (j<arr2.length) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
	}
}
