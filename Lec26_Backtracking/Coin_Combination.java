package Lec26_Backtracking;
import java.util.*;
public class Coin_Combination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] coin= {2,3,6,7};
		int amount=7;
		Printanswer(coin, amount,"",0);
		//System.out.println(Printanswer(coin, amount,"",0));
	}

	public static void Printanswer(int [] coin, int amount,String ans,int last) {
		if (amount==0) {
			System.out.println(ans);
			return;
		}
		// for permutation loop will start from 0
		for (int i = last; i < coin.length; i++) {
			
			if (amount>=coin[i]) {
				// amount=amount-coin[i];
				//Printanswer(coin, amount,ans+coin[i]);
				//amount=amount+coin[i];
				Printanswer(coin, amount-coin[i],ans+coin[i],i);
				
			}
		}
	
	}
}
