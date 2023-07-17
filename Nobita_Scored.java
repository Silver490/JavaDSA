import java.util.*;

public class Nobita_Scored {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- >0) {
			int n = sc.nextInt();
			int x= sc.nextInt();
			
		int ans=Return(n,x);
		System.out.println(ans);
		}
		
//		int n=3;
//		int x=4;
//		int ans=Return(n,x);
//		System.out.println(ans);
	}
	
	public static int Return(int n, int x) {
		int rem= n%x;
		return rem;
		
	}
}
