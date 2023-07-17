package Lec28;
import java.util.*;
public class Sudoku_Solver {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		int n= sc.nextInt();
//		int [][] grid=new int [n][n];
//		for (int i = 0; i < grid.length; i++) {
//			for (int j = 0; j < grid.length; j++) {
//				grid[i][j]=sc.nextInt();
//			}
//		}
		int [][]grid1={ {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
		         {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
		         {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
		         {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
		         {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
		         {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
		         {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
		         {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
		         {0, 0, 5, 2, 0, 6, 3, 0, 0} };
		
		SudokuSolver(grid1,0,0);
	}
	public static void SudokuSolver(int [][] grid,int row, int col) {
		if (col==9) {
			row++;
			col=0;
		}
		if (row==9) {
			display(grid);
			return;
		}
		if (grid[row][col]!=0) {
			SudokuSolver(grid, row, col+1);
		}
		else {
			for (int val = 1; val <=9; val++) {
				if (isitsafe(grid,row,col,val)==true) {
					grid[row][col]=val;
					SudokuSolver(grid,row,col+1);
					grid[row][col]=0;
				}
			}
		}
		
	}
	
	public static void display(int [][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public static boolean isitsafe(int[][] grid, int row, int col,int val) {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][col]==val) {
				return false;
			}
		}
		
		for (int i = 0; i < grid.length; i++) {
			if (grid[row][i]==val) {
				return false;
			}
		}
		// 3X3 matrix
		int r=row-row%3;
		int c=col-col%3;
		for (int i = r; i <r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if (grid[i][j]==val) {
					return false;
				}
			}
		}
		return true;
	}
}
