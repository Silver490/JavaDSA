package Lec25_TOH;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "A";
		String hlp = "B";
		String des = "C";
		int n = 3;
		TOH(n, src, hlp, des);
	}

	public static void TOH(int n, String src, String hlp, String des) {
		if (n==0) {
			return;
		}
		
		TOH(n-1,src,des,hlp); // Starting ke n-1 disc src se helper me le jaana hai, therefor helper will act as des here
		System.out.println("Move "+ n+ "th disc from "+src+" to " +des);
		TOH(n-1,hlp,src,des);  // disc helper se des me le jaana hai, therefor des will act as des here
	}
}
