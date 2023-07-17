package Lec13;

public class Bad_version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10000;
		System.out.println(Search(n));

	}
	
	public static int Search(int n) {
		
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid= (hi-lo)/2 + lo;
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
