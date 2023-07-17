package Lec13;

public class bad_version1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,8,9,12,14,15,16,17};
		int item=14;
		System.out.println(Search(arr,item));

	}
	
	public static int Search(int [] arr, int item) {
		int n= arr.length;
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid= (hi-lo)/2 + lo/2;
			if(isBadVersion(mid)==true) {
				ans=mid;
				hi=mid-1;
			}
			
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	
	public static boolean isBadVersion(int v) {
		return false;
	}
}
