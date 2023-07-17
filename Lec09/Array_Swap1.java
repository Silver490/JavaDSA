package Lec09;
import java.util.Scanner;
public class Array_Swap1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //int n = sc.nextInt();
	    int [] arr= {1,2,3,4,5,6};
		//System.out.println(arr.length);
	    System.out.println(arr[0]+" "+arr[1]);
	    swap(arr[0],arr[1]);
	    System.out.println(arr[0]+" "+arr[1]);
	    
	}

	public static void swap(int a, int b) {
		
		int temp=a;
		a=b;
		b=temp;
	}
	
}
