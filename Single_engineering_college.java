import java.util.*;

public class Single_engineering_college {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int [] arr= new int [n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
//		int x=sc.nextInt();
		int [] arr= {15 ,19, 12, 13};
		int x=6;
		Return(arr,x);
	}
	
	public static void Return(int [] arr, int x) {
		int sum =0;
		int h=x*2;
		while(h>x) {
			for (int i = 0; i < arr.length; i++) {
				sum+= arr[i]-h;
			}
			if (sum==x) {
				System.out.println(h);
				break;
			}
			h++;
			
		}
		
	
	}
}
