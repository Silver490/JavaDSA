package Lec24;

public class Maze_path {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3; // rows
		int m=3; // columns
		
		printPath(0,0,n-1, m-1,"");		
				
	}
	// cr--> cuurent row
	// cc--> current col
	// er--> end row
	// ec --> end col
	public static void printPath(int cr, int cc,int er, int ec,String ans) {
		if (cr==er && cc==ec) {
			System.out.println(ans);
			return;
		}
		
		if (cr>er || cc>ec) {
			return;
		}
		
		printPath(cr, cc+1,er,ec,ans+"H");
		printPath(cr+1, cc,er,ec,ans+"V");
		
	}
}
