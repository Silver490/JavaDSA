package Lec38;
import java.util.*;

public class Block_Span {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		CalSpan(arr);
	}
	
	// O(N) Time complexity
	public static void CalSpan(int[] arr) {
		Stack<Integer> st=new Stack<>();
		int [] ans= new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			// making next greater
			while (!st.empty() && arr[i]>arr[st.peek()]) {
				st.pop();
			}
			
			// current calculate
			if (st.empty()) {
				ans[i]=i+1;
			} else{
				ans[i]=i-st.peek();
			}
			
			
			st.push(i);
		}
		
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.print("END");
	}
}

