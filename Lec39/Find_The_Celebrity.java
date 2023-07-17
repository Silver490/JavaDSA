package Lec39;
import java.util.*;
public class Find_The_Celebrity {
	public static void main(String[] args) {
		int [][] arr = { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0} };
		System.out.println(Celebrity(arr));
	}

	public static int Celebrity(int[][] arr) {
		Stack<Integer> st= new Stack<>();
		
		for (int i = 0; i < arr.length; i++) {
			st.push(i);
		}
		while(st.size()>1) {
			int a=st.pop();
			int b=st.pop();
			if (arr[a][b]==1) {
				st.push(b);
			} else {
				st.push(a);
			}
		}
		
		
		int  candidate = st.peek();
		for (int i = 0; i < arr.length; i++) {
			if (i!=candidate && (arr[i][candidate]==0)|| arr[candidate][i]==1) {
				return -1;
			}
		}
		return candidate;
		
	}

}
