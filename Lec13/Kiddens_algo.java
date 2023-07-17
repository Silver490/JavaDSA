package Lec13;

public class Kiddens_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,-5,11,-1,3};
		System.out.println(Kiddens_algo(arr));
	}
	public static int Kiddens_algo(int [] arr) {
		int sum =0;
		int ans=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans= Math.max(sum, ans);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
}
