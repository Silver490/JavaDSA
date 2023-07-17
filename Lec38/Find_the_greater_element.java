package Lec38;
import java.util.*;

public class Find_the_greater_element {
	public static void main(String[] args) {

//		Scanner scn = new Scanner(System.in);
//			int n = scn.nextInt();
//			int[] arr = new int[n];
//
//			for (int i = 0; i < arr.length; i++)
//				arr[i] = scn.nextInt();
//
//			nextLarger(arr);
		
		int[] arr = {1,2,3};
		nextLarger(arr);

	}
	
	// O(N) Time complexity
	public static void nextLarger(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int [] ans= new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			// making next greater
			while (!st.empty() && arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
			}
			
			// current element
			st.push(i);
		}
		
		while (!st.empty()) {
			ans[st.pop()]=-1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i]+","+ans[i]);
		}
	}
}

