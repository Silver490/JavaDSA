import java.util.*;
public class Inc_Dec_Sequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int [] arr= {1,2,6,4,5};
		System.out.println(Return(arr));
	}
	
	public static boolean Return(int []arr) {
		int f=arr[0];
		for (int i=1; i < arr.length; i++) {
			if (arr[i]>f) {
				f=arr[i];
			} else {
				break;
			}
		}
		if(arr[arr.length-1]==f) {
			return true;
		} else {
			return false;
		}
	}
}
