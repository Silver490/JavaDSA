package Recursion_Assignment;

import java.util.*;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); // total rows
		int m=sc.nextInt(); // total columns
		ArrayList<String> list=new ArrayList<>();
		
		printPath(0,0,n-1, m-1,"",list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		System.out.println(printPathCount(0,0,n-1, m-1,""));		
	}
	// cr--> cuurent row
	// cc--> current col
	// er--> end row
	// ec --> end col
	public static void printPath(int cr, int cc,int er, int ec,String ans,List<String> list) {
		if (cr==er && cc==ec) {
			//System.out.println(ans);
			list.add(ans);
			return;
		}
		
		if (cr>er || cc>ec) {
			return;
		}
		
		printPath(cr+1, cc,er,ec,ans+"V",list);
		printPath(cr, cc+1,er,ec,ans+"H",list);
		
	}
	
	public static int printPathCount(int cr, int cc,int er, int ec,String ans) {
		if (cr==er && cc==ec) {
			//System.out.println(ans);
			return 1;
		}
		
		if (cr>er || cc>ec) {
			return 0;
		}
		
		int a=printPathCount(cr, cc+1,er,ec,ans+"H");
		int b=printPathCount(cr+1, cc,er,ec,ans+"V");
		return a+b;
	}
}
