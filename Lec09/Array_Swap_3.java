package Lec09;
import java.util.Scanner;
public class Array_Swap_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //int n = sc.nextInt();
	    int [] arr= {10,20,30,40,50};
	    int [] other = {100, 200, 300, 400,500};
		//System.out.println(arr.length);
	    System.out.println(arr[0]+" "+other[0]);
	    swap(arr,other);
	    System.out.println(arr[0]+" "+other[0]);
	    
	}

	public static void swap(int []arr, int [] other) {
		
		int []temp=arr;
		arr=other;
		other=temp;
	}
	
	

}
