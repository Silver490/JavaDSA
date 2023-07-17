package Lec29_Leetcode;
import java.util.*;
public class Combination_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coin = {2,3,6,7};
		Arrays.sort(coin);
		int amount = 7;
		List<Integer> ll= new ArrayList<>();
		List<List<Integer>> ans= new ArrayList<>();
		Printanswer(coin, amount, ll, 0,ans);
		System.out.println(ans);
	}

	public static void Printanswer(int[] coin, int amount, List<Integer> ll, int last,List<List<Integer>> ans) {
		if (amount == 0) {
			ans.add(new ArrayList<Integer>(ll));
			return;
		}
		// for permutation loop will start from 0
		for (int i = last; i < coin.length; i++) {
			if (i!=last && coin[i]==coin[i-1]) {
				continue;
			}
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Printanswer(coin, amount - coin[i], ll, i,ans);
				ll.remove(ll.size()-1);

			}
		}

	}
}

