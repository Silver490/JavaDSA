package Lec10;
public class Reverse_range {

	public static void main(String[] args) {
		
		int[] arr = { 5,6,2, 3, 5, 6, 7, 8, 1, 9 };
		int i = 2;
		int j = 5;
		reverse(arr,i,j);

		// to Print array after change
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}

	}

	public static void reverse(int[] arr, int i, int j) {
		// This Method is called "two-pointer" approach

		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
