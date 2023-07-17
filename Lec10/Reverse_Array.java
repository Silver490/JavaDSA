package Lec10;
import java.util.Scanner;
public class Reverse_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //int n = sc.nextInt();
	    int [] arr= {2,3,5,6,7,8,1,9};
	    reverse(arr);
	    
	    //to Print array after change
	    for(int i=0; i<arr.length; i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    
	}

	public static void reverse(int []arr) { 
		// This Method is called "two-pointer" approach
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	

}
