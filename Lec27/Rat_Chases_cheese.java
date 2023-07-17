package Lec27;

import java.util.*;

public class Rat_Chases_cheese {
	static boolean f = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] maze = new char[n][m];
		for (int i = 0; i < maze.length; i++) {
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				maze[i][j] = str.charAt(j);
			}
		}

		int[][] ans = new int[n][m];
		Ratinamaze(maze, 0, 0, ans);
		if (f == false) {
			System.out.println("NO PATH FOUND");
		}

	}

	public static void Ratinamaze(char[][] maze, int cc, int cr, int[][] ans) {
		if (cr == maze.length  && cc == maze[0].length  && maze[cr][cc] != 'X') {
			ans[cr][cc] = 1;
			Display(ans);
			System.out.println();
			f = true;
			return;
		}
		if (cc < 0 || cr < 0 || cc >= maze[0].length || cr >= maze.length || maze[cr][cc] == 'X'|| f == true) {
			return;
			
		}
		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
//		int [] r={ -1,1,0,0,-1,1,-1,1}; for 8 directions
//		int [] c={ 0,0,1,-1, 1,1,-1,-1};
		
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, 1, -1 };
		for (int i = 0; i < c.length; i++) {
			Ratinamaze(maze, cc + c[i], cr + r[i], ans);
		}

//		Ratinamaze(maze, cc, cr - 1, ans);// Move up
//		Ratinamaze(maze, cc - 1, cr, ans);// Move left
		
		Ratinamaze(maze, cc + 1, cr, ans);// Move right
		Ratinamaze(maze, cc, cr + 1, ans);// Move down
		maze[cr][cc] = '0';
		ans[cr][cc] = 0;

	}

	public static void Display(int[][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}
