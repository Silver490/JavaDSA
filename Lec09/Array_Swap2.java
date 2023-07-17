package Lec09;
import java.util.Scanner;
public class Array_Swap2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //int n = sc.nextInt();
	    int [] arr= {1,2,3,4,5,6};
		//System.out.println(arr.length);
	    System.out.println(arr[0]+" "+arr[1]);
	    swap(arr,0,1);
	    System.out.println(arr[0]+" "+arr[1]);
	    
	}

	public static void swap(int []arr, int i, int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

}
