package Lec23;

public class Board_Path {
	public static void main(String[] args) {
		int n = 3;
		BoardPath(0, n, "");
		System.out.println();
		System.out.println(BoardPathCount(0,n,""));

	}

	public static void BoardPath(int curr, int n, String ans) {

		if (curr == n) {
			System.out.print(ans+" ");
			return;
		}
		
		if (curr > n) {
			return;
		}

		BoardPath(curr + 1, n, ans + 1); // string+int = string
		BoardPath(curr + 2, n, ans + 2);
		BoardPath(curr + 3, n, ans + 3);
	}
	
	
	public static int BoardPathCount(int curr, int n, String ans) {

		if (curr == n) {
			//System.out.println(ans);
			return 1;
		}

		if (curr > n) {
			return 0;
		}

		int a1=BoardPathCount(curr + 1, n, ans + 1); // string+int = string
		int b1=BoardPathCount(curr + 2, n, ans + 2);
		int c1=BoardPathCount(curr + 3, n, ans + 3);
		return a1+b1+c1;
	}
}
